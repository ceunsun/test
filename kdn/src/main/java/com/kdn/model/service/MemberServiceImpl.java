package com.kdn.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kdn.model.dao.MemberDao;
import com.kdn.model.domain.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("memberDao")
	private MemberDao dao;
	
	@Override
	public Member search(String id) {
		Member m = null;
		
		try {
			if(id!=null) {
				m = dao.search(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return m;
	}

}
