<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="exception.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
	
	int ans = n1 / n2;
	
	out.print("Output is :"+ ans);

%>
<br>
<%
	String pageName = page.toString();
	out.print("The Current Page is : "+ pageName);
%>
</body>
</html>