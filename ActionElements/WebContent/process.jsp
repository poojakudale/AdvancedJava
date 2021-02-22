<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="com.bean.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/>
	
	<br>
	<H1>Record :<br>
	UserName : <jsp:getProperty property="name" name="u"/><br>
	Password :<jsp:getProperty property="password" name="u"/><br>
	Email Id :<jsp:getProperty property="email" name="u"/><br>
	
	</H1>
</body>
</html>