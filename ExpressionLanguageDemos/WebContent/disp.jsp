<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Author Name  ${applicationScope.Author } <br>
Book Name ${applicationScope.Book }<br>
User Name ${sessionScope.User }
</body>
</html>