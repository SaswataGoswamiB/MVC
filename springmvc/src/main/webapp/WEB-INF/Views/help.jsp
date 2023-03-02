<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page </title>
</head>
<body>
		<h1>This is help page</h1>
		
		<%
			String name=(String)request.getAttribute("name");
			LocalDateTime loca=(LocalDateTime)request.getAttribute("now");
		%>
		
		<h1>My name is : <%=name %></h1>
		
		<h2>
	Kalpan is  ${kalpan}</h2>
		
		<h2>Time is  <%=loca %></h2>
</body>
</html>