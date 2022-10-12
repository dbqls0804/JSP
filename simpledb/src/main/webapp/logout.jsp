<%
//모든 세션의 데이터를 삭제 후 로그인 페이지로 이동
session.invalidate(); 
response.sendRedirect("index.jsp");
%>