<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" %>
 <%@ include file="Decorator.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int value=(int)request.getAttribute("num");
		int sum=9/value;
		out.println(sum);
		
	%>
</body>
</html>