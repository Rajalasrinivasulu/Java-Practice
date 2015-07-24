<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

	<h1>Hello</h1>
	<%
	String uname=request.getParameter("name");
	if(uname!=null){
	session.setAttribute("SessionUname", uname);
	// application.setAttribute("contextuname", uname);
	pageContext.setAttribute("pageattrinute", uname);
	pageContext.setAttribute("jspCOntext", uname, pageContext.APPLICATION_SCOPE);
	}
	%>
	user name is :<%=uname %>
	<bR>
	Session Uname is :<%=session.getAttribute("SessionUname") %>
	<br>
	Context uname  is :<%=application.getAttribute("contextuname") %>
	<br>
	Page Context uname is:<%=pageContext.getAttribute("pageattrinute") %> 
	

</body>
</html>