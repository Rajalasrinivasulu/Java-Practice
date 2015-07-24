<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style=text-align:center>Hello Welcome to JSP(Java Server Pages)</h1>
	<p style=color:red>Where we write Java code inside a html ,and Tomcat internallyt
	converts this jsp code into a servlet and render in the web browser</p>
	
	
	<%!// Method Defination 
	   public int add(int x, int y){// we can call this method any where in the jsp file.
		return x+y; }
	%>
	<% 
	int a=10;
	int b=30;
	int c=a+b;// this is  java code inside a html for making our website mre dyanmic .
	// out.println("Addition of two numbers is "+c); 
	%>
	Addition of Two Numbers is :<%=c%>
	<%
	int c1=20;// i jsp everything treats as a local varibale even if you write them in different tags.
	out.println(c1+"<br>");
	%>
	<%
	 c=add(10010,030);
	%>
	<strong>Addition of  two numbers from add method  is</strong>:<%=c %><br>
	 
	<% for(int j=0;j<10;j++) {		
	%>
	<br> addition is :<%=j %>
	<% } %>

</body>
</html>