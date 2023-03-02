<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output:</title>
</head>
	<body>


	<!--  <%
			String name=(String)request.getAttribute("name");
			String email=(String)request.getAttribute("email");
			String password=(String)request.getAttribute("password");
	
	%>-->
	
	<h1>Hello  
	${user.name} 
	</h1>
	
	<h1>your mail id is 
	${user.email} 
	</h1>
	
	<h1>and your password is  
	${user.passowrd} .Try keeping it secret.
	</h1>
	
</body>
</html>