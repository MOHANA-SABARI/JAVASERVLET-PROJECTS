package demoHttp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessiondemoHttp extends HttpServlet{
	
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		PrintWriter out = response.getWriter();
		out.println("<h1>User Request is : "+SessiondemoHttpListener.totalcount+" </h1>");
		
		System.out.println("REQUEST :"+SessiondemoHttpListener.usercount);
	}
}
