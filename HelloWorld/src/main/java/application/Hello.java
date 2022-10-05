package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet { //HttpServlet 클래스를 상속시킴

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("헬로우");
		//HttpServletRequest reqest(서버에요청) HttpServletResponse response(서버가응답) -> 웹에서 필수 기본형식
		PrintWriter out = response.getWriter(); //out 객체 생성 후 html을 자바 코드안에 넣는 것
		out.println("<html>");
		out.println("<head>");
		out.println("<title>naver</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>my servlet</h1>");
		out.println("</body>");
		out.println("</html>");
		//html을 위와 같이 쓰는 것이 너무 어려움 -> JSP 이용
	}
}
