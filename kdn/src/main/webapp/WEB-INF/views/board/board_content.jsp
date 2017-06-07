<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!-- white bg -->
<section class="tm-white-bg section-padding-bottom">
	<div class="container">
		<div class="row">
			<div class="tm-section-header section-margin-top">
				<div class="col-lg-4 col-md-3 col-sm-3">
					<hr>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<h2 class="tm-section-title">신고게시판</h2>
				</div>
				<div class="col-lg-4 col-md-3 col-sm-3">
					<hr>
				</div>
			</div>
		</div>
		<div class="row">
			<!-- Testimonial -->
			<div class="col-lg-12">
				<div class="tm-what-we-do-right">
					<div class="row">
					<div class="dreamcrub">
						<ul class="breadcrumbs">
							<li class="home"><a href="main.syt" title="Go to Home Page">Home</a>&nbsp;
								<span>&gt;</span></li>
							<li class="women">Board</li>
						</ul>
						<ul class="previous">
							<li><a href="main.syt">이전 페이지로</a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="toolbar">
						<div class="sort">
							<div class="sort-by">
								<label>Sort By</label>
								<select>
									<option value="">제목</option>
									<option value="">작성자</option>
								</select> <a href=""><img src="img/arrow2.gif" alt="" class="v-middle"></a>
							</div>
						</div>
						<ul class="pagenation">
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<table class="table table-hover table-responsive table-striped board_table">
						<thead>
							<tr>
								<th>No</th><th>Title</th><th>Writer</th><th>date</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="i" begin="1" end="10">
								<tr>
									<td>${i}</td><td>제목입니다~~~~~~~~</td><td>ID</td><td>2017.06.06</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				</div>
				<div class="tm-testimonials-box">
					<h3 class="tm-testimonials-title">KDN Car Rental System</h3>
					
					<%-- <ul>
						<c:choose>
							<c:when test="${empty id}">
								<li><a href="#" data-toggle="modal" data-target="#loginModal">Login</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="myPage.do">${id}</a></li>
							</c:otherwise>
						</c:choose>
						<li><a href="about.do">About</a></li>
						<li><a href="board.do">Board</a></li>
						<li><a href="contact.do">Contact</a></li>
					</ul> --%>
				</div>
			</div>
		</div>
	</div>
</section>