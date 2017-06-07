<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="tm-header">
	<div class="container ">
		<div class="row">
			<nav class="tm-login-nav">
			<ul>
				<c:choose>
					<c:when test="${empty name}">
						<li>
							<a href="#" data-toggle="modal" data-target="#loginModal">
								<span class="glyphicon glyphicon-log-in"></span> 로그인
							</a>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<a href="myPage.do">
								<span class="glyphicon glyphicon-user"></span> ${name} 님
							</a>&nbsp
						</li>
						<li>
							<a href="#">
								<span class="glyphicon glyphicon-thumbs-down"></span> 벌 점 : ${penalty}p
							</a>
						</li>
						<li>
							<a href="logout.do">
								<span class="glyphicon glyphicon-log-out"></span> 로그아웃
							</a>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
			</nav>
		</div>
	</div>
</div>
<div class="tm-header-nav">
	<div class="container ">
		<div class="row">
			<div class="col-lg-6 col-md-8 col-sm-9">
				<div class="mobile-menu-icon">
					<i class="fa fa-bars"></i>
				</div>
				<nav class="tm-nav">
					<ul class="dropdown">
						<li>
							<a href="home.do">
								<span class="glyphicon glyphicon-home"></span> 홈
							</a>
						</li>
						<li><a href="about.do">서비스 안내</a></li>
						<li><a href="board.do">고객 센터</a></li>
						<li><a href="contact.do">Contact</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</div>