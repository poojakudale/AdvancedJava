<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'Welcome to JSTL Core Tag Demo'}"></c:out>


<br>
<br>

<c:set var="Income" value="${ 5000 *4 }" scope="session"></c:set>
<p>Before Remove value is : <c:out value="${Income }" />

<br>
<br>
<c:if test="${Income > 15000 }">
	<p>Income is : <c:out value="${Income }"></c:out>
</c:if>
<br>
<c:remove var="Income"/>
<p>After Remove value is : <c:out value="${Income }" />

<br>
<br>

<c:catch var="catchTheException">
	<% int x = 4/0; %>
</c:catch>

<c:if test = "${catchTheException != null }">
	<p>The type of exception is : ${catchTheException }<br>
	
</c:if>


</body>
</html>