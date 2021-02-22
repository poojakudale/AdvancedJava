<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	application.setAttribute("Author", "Balakrishnan");
	application.setAttribute("Book" ,"C++");
	
	session.setAttribute("User","Administrator");
%>
<a href="disp.jsp">Click</a>
</body>
</html>