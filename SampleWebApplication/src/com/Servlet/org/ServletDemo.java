package com.Servlet.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		System.out.println("Hello from Do GEt method()");
		writer.println("<h1 style=background-color:green>Hello</h1>");
		writer.println("<h4>Srinnivas Reddy</h4> "+
						"<h1 style=color:red>Hello </h1>" +
						"<table  BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=50% style=text-align:center>" +
						 "<thead style=color:red;><tr><th>S.NO</th><th>Name</th><th>Address</th></tr></thead>" +
						 "<tbody><tr><td>1</td><td>Srininvas reddy</td><td>New York</td></tr>" +
						  "<tr><td>2</td><td>Rajala</td><td>California</td>" +
						  "<tr><td>3</td><td>Venkat Reddy</td><td>Michigan</td></tbody></table>"+"<br><br>");
		for(int i=0;i<10;i++){			
		
		writer.println("integers from 1 to 10 is "+i+"<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
