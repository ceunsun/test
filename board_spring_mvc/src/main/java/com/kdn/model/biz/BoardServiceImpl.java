package com.kdn.model.biz;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kdn.model.domain.Board;
import com.kdn.model.domain.FileBean;
import com.kdn.model.domain.PageBean;
import com.kdn.model.domain.UpdateException;
import com.kdn.util.DBUtil;
import com.kdn.util.PageUtility;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	@Qualifier("boardDao")
	private BoardDao dao;
	@Override
	public void add(Board board, String dir) {
		Connection con = null;
		File[] files = null;  //실제 저장할 파일정보
		int size = 0;
		try {
			con = DBUtil.getConnection();
			//게시글처리
			int bno = dao.getBoardNo(con);
			board.setNo(bno);
			dao.add(con, board);
			
			//보드파일처리
			MultipartFile[] fileup = board.getFileup();   //파일을 추출해옴
			if(fileup!=null){
				size = fileup.length;
				files = new File[size];
				ArrayList<FileBean> fileInfos = new ArrayList<FileBean>(size);
				String rfilename = null;
				String sfilename = null;
				int index=0;
				for (MultipartFile file : fileup) {
					rfilename = file.getOriginalFilename();  //실제올린 파일
					sfilename = String.format("%d%s",System.currentTimeMillis(), rfilename); //현재시간 붙여서 저장할 파일 
					
					fileInfos.add(new FileBean(rfilename,sfilename));  //DB에 저장할수있게 filebean에 해서 
					String fileName = String.format("%s/%s",dir,sfilename); //실제 경로에 저장할 것. 디렉토리 아래 파일이름 생성 
					files[index] = new File(fileName);  
					file.transferTo(files[index++]);  //실제 경로에 저장이 되게 하고 인덱스 하나씩 증가 
				}
				dao.addFiles(con, fileInfos, bno);  //파일정보를 db에 저장 
			}
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			DBUtil.rollback(con);
			if(files!=null){  
				//오류가 발생해서 롤백하기 때문에 저장한 파일이 있다면 삭제
				for (File file : files) {
					//해당 파일이지정한 경로에 존재하면 
					if(file!=null && file.exists()){
						file.delete();  //파일 삭제 
					}
				}		
			}
			throw new UpdateException("게시글 작성 중 오류 발생");
		} finally {
			DBUtil.close(con);
		}
	}

	@Override
	public void update(Board board) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			dao.update(con, board);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UpdateException("게시글 수정 중 오류 발생");
		} finally {
			DBUtil.close(con);
		}
	}

	@Override
	public void remove(int no) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			dao.removeFiles(con, no);
			dao.remove(con, no);
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			DBUtil.rollback(con);
			throw new UpdateException("게시글 삭제 중 오류 발생");
		} finally {
			DBUtil.close(con);
		}
	}
	@Override
	public Board search(int no) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			return dao.search(con, no);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UpdateException("게시글 검색 중 오류 발생");
		} finally {
			DBUtil.close(con);
		}
	}
	@Override
	public List<Board> searchAll(PageBean bean) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			int total = dao.getCount(con, bean);
			
			PageUtility bar = 
			  new PageUtility(bean.getInterval()
					  		, total
					  		, bean.getPageNo()
					  		, "images/");
			bean.setPagelink(bar.getPageBar());
			
			return dao.searchAll(con, bean);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UpdateException("게시글 검색 중 오류 발생");
		} finally {
			DBUtil.close(con);
		}
	}
}
