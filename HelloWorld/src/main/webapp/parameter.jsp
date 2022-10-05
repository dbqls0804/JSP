<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String user = request.getParameter("user");
	String id = request.getParameter("id");
	
	out.println("유저 : " + user);
	out.println("아이디 : " + id);
	
	%>
	<br>
	<br>
	<h2>num 파라메터를 받아 반복하기</h2>
	<%
	String num = request.getParameter("num");
	if(num == null) {
	%>
	<p>파라메터 num 입력 안됨 null</p>
	<%} else { %>
	<p>
		파라메터 num 은
		<%=num %>
	</p>
	<%} %>

	<%
		//문자열인 num을 숫자로 변환시켜야함(integer)
		for(int i = 0; i < Integer.parseInt(num); i++) {
	%>
	<p> num의 숫자만큼 반복 <%=i %> </p>
	
	<%} %>


</body>
</html>