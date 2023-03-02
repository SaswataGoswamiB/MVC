<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- This tag is used not to ignore Expression Langugae bco by default Expression Language is ignored -->
<%@page isELIgnored="false" %>

<!-- Using JSTL 's taglib directory -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>without using get attribute</title>
</head>
<body>
<!-- ${name } is used as expression Language -->
	<h1>Hello all name is 
	${name} 
	</h1>
	
	
	<h2>Kalpan is  ${kalpan}</h2>
	
	<h1>The marks of the students are as follows:  ${arr} </h1>
	
	
</body>
</html>