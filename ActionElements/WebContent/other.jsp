<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a>I am on the other page where request is forwarded</a><br>
<%=request.getParameter("name") %><br>
<br>
<jsp:include page="index.html"></jsp:include>
</body>
</html>