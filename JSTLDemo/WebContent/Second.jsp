<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="Msg" value="Welcome to JSTL Core n FunctionTags Programming"></c:set>

<c:if test = "${ fn:contains(Msg, 'FunctionTags')}">
<p>String is Found.
</c:if>
<br>
<br>

<c:if test = "${ fn:endsWith(Msg, 'Programming')}">
<p>String ends with Content.
</c:if>

</body>
</html>