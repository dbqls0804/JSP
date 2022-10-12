<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 프로젝트명/클래스명 -->
<form action="/Forms/formHandler.jsp" method ="get"> 
<input type = "text" name="user" placeholder = "유저"> <br>
<input type = "password" name="password" placeholder = "비번"> <br>
<input type = "submit" value="전송">
</form>

</body>
</html>