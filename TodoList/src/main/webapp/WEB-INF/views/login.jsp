<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todo 리스트</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>

</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container">
			<a href="/todoList" class="navbar-brand">🎯</a>

			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/todoList/list-todos.do">Todos</a></li>
				<li><a href="https://velog.io/@dbqls0804">Blog</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<%
					if (session.getAttribute("name") == null) {
				%>
				<li><a href="/todoList/Login.do">Login</a></li>
				<%
					} else {
				%>
				<li><a href="/todoList/Logout.do">Logout</a></li>
				<%
					}
				%>
			</ul>
		</div>
	</nav>

	<div class="container">
			<form action="/todoList/Login.do" method="post">
			<p>
				<font color="red">${errorMessage}</font>
			</p>
			Name: <input type="text" name="name" /> Password:<input
				type="password" name="password" /> <input type="submit"
				value="Login" />
		</form>
	</div>

	<footer class="footer">
		<div>footer content</div>
	</footer>

	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>