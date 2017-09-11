package kr.ac.hansung;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트에서 submit을 누르면 이곳에서 받게 된다. 톰캣에 의해서 이 메소드가 호출되므로
		//이 안을 채워 주어야 한다
		//read form data
		String userName= request.getParameter("username");
		String passWord= request.getParameter("password");
		
		//Build HTML code
		//클라이언트에게 넘겨줄 것 뭘 넘겨 주는데? response data를
		PrintWriter out = response.getWriter();
		String htmlResponse="<html>";
		htmlResponse +="<h2>your name is"+userName+"<br/>";
		htmlResponse +="your password is"+passWord+"</h2>";
		htmlResponse +="</html>"; 
		out.println(htmlResponse);
		
		//이렇게 해서 println을 하면은 htmlResponse의 내용들이 클라이언트로 html형태로 날아가게 된다.
		
		
		
		
	}

}
