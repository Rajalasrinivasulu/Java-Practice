package com.Servlet.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			PrintWriter writer=response.getWriter();
			String uname=request.getParameter("userName");
			HttpSession session=request.getSession();
			ServletContext context=request.getServletContext();
			if(uname!="" && uname!=null){
			session.setAttribute("Sessisionuname", uname);
			context.setAttribute("context", uname);
			}			
//			session.setAttribute("Sessisionuname", uname);
			writer.println("User name is "+uname);
			writer.println("Session value is "+(String)session.getAttribute("Sessisionuname"));
			writer.println("Context is "+(String)context.getAttribute("context"));
	}
	

}
