<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
		<h1>This is called home page</h1>
		<h1>Called by Home Controller</h1>
		<%
					String s= (String)request.getAttribute("name");
		
					List<String> frnd=(List<String>)request.getAttribute("lulu");
		
	
		
		%>
		
		<h1>Name is <%=s%></h1>
		
		<%
				for(String  string: frnd){
		%>
		
		<h1><%=string %></h1>
		
		<%
				}
		%>
</body>
</html>