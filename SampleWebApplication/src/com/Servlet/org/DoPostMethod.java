package com.Servlet.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoPostMethod extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			PrintWriter writer=response.getWriter();
			writer.println("<h2>Hello Welcome to  Doget Form </h2>");
			String uname=request.getParameter("userName");
			String userid=request.getParameter("userid");
			String password=request.getParameter("Password");
			writer.println("User name from get method  "+uname+"<br>");
			writer.println("User id from get method"+ userid);
			writer.println("Passwor id from get method "+ password);
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			PrintWriter writer=response.getWriter();
			writer.println("<h2>Hello Welcome to  Doget Form </h2>");
			String uname=request.getParameter("userName");
			String userid=request.getParameter("userid");
			String password=request.getParameter("Password");
			writer.println("User name is from Post Method "+uname+"<br>");
			writer.println("User id is from Post Method "+ userid+"<br>");
			writer.println("Passwor is from Post Method "+ password+"<br>");
	}

}
