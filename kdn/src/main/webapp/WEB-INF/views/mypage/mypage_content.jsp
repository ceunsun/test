<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<section class="tm-white-bg section-padding-bottom">
	<div class="container">
		<div class="row">
	     <br/><br/>
          <div class="col-lg-6" >
             <h3>고객 정보</h3><br/>
                 <div class="table-responsive" >
                    <table class="table table-hover" >
                          <tbody>                   
                              <tr>
                                 <td>사 번</td>
                                 <td>1111 ${member.id }</td>
                              </tr>     
                              <tr>
                                 <td>이 름</td>
                                 <td>ㅇㅇㅇ ${member.name }</td>
                              </tr>
                              <tr>
                                  <td>비밀번호</td>
                                  <td>1111 ${member.pw }</td>                                    
                               </tr>
                               <tr>
                                   <td>부 서</td>
                                   <td>ㅐㅐㅐ ${member.dept }</td>
                               </tr>
                               <tr>
                                   <td>전화번호</td>                                       
                                   <td>43000  ${member.phone }</td>
                               </tr>
                               <tr>
                                   <td>이메일</td>
                                   <td>23@naver.com ${member.email }</td>
                               </tr>
                          </tbody>
                     </table>
              </div>
       <br/><br/><br/>
          <div class="col-lg-13">
             <h3>예약 정보</h3><br/>
                 <div class="table-responsive">
                    <table class="table table-hover">
                      <theader>
                         <tr>
                              <td>차량이미지</td><td>차량번호</td><td>날짜</td><td>상태 </td> <td><button>반납</button></td>
                         </tr>
                      </theader>
                      <tbody>                   
                         <tr>
                              <td>차량이미지</td><td>차량번호</td><td>날짜</td><td>상태 </td> <td><button>반납</button></td>
                         </tr>
                      </tbody>
                    </table>
            </div>
		</div>
	</div>
</section>






