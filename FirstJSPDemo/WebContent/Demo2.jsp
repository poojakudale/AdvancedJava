<%@page import="java.util.Date" isThreadSafe="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%! String Course = "Advanced Java"; %>
		<%
			int num =Integer.parseInt(request.getParameter("num"));
				session.setAttribute("No", num);
		%>
		<%=new Date() %>
		<h1>Number is : <%=num %>
		<h2>Course Name is : <%=Course %> </h2> <%--used expression tag --%>
</body>
</html>