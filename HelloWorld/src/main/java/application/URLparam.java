package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url") //이름 길면 바꿈
public class URLparam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라메터 요청(request) 시 주소 뒤에 ?user=cha(문자열)
		// http://localhost/hello/url?user=cha
		String user = request.getParameter("user");
		String id = request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("user : " + user);
		out.println("id : " + id);
		out.println("</html>");
	}

}
