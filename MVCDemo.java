package com.mvcweb.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCDemo
 */
@WebServlet("/MVCDemo")
public class MVCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname;
		 uname=request.getParameter("username");
		 String pwd=request.getParameter("password");
		 MvcDemoTest mvc=new MvcDemoTest();
		boolean result= mvc.authenctication("username", "password");
		if(result){
			response.sendRedirect("Success.jsp");
			return;
		} 
		else {
			response.sendRedirect("login.jsp");
			return;
			
		}
	}

}
