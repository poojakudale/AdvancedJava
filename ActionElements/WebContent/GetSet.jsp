<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="mybean" class="com.bean.TestBean"></jsp:useBean>
<jsp:setProperty property="message" name="mybean" value="GetSetActions"/>
<jsp:getProperty property="message" name="mybean"/>
</body>
</html>