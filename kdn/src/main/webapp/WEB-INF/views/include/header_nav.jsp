<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="tm-header">
	<div class="container ">
		<div class="row">
			<nav class="tm-login-nav">
			<ul>
				<c:choose>
					<c:when test="${empty id}">
						<li>
							<a href="#" data-toggle="modal" data-target="#loginModal">
								<span class="glyphicon glyphicon-log-in"></span> Login
							</a>
						</li>
					</c:when>
					<c:otherwise>
						<li><a href="myPage.do">${id}</a></li>
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
			<div class="col-lg-6 col-md-4 col-sm-3 tm-site-name-container">
				<!-- <a href="home.do" class="tm-site-name">KDN</a> -->
			</div>
			<div class="col-lg-6 col-md-8 col-sm-9">
				<div class="mobile-menu-icon">
					<i class="fa fa-bars"></i>
				</div>
				<nav class="tm-nav">
					<ul>
						<li><a href="home.do">Home</a></li>
						<li><a href="about.do">About</a></li>
						<li><a href="board.do">Board</a></li>
						<li><a href="contact.do">Contact</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</div>