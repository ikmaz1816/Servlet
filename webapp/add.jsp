<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true" %>
<%@page import="java.util.*" %>
<%@ include file="home.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		/*
			There are certain implict objects
			pageContext
			request
			response
			config
			application
			session
		*/
		session.setAttribute("name","Imran");
	%>
</body>
</html>