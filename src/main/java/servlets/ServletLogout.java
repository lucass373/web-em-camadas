package servlets;


import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogout extends HttpServlet implements Servlet 
{
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) 
						 throws ServletException, IOException 
	{
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, 
				  		  HttpServletResponse response) 
				  		  throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		session.invalidate();
		
		response.sendRedirect("login.jsp");		
	}
}


