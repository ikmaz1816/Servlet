<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/management";
		String username="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
		{
			out.println("Connection established");
		}
	%>
</body>
</html>