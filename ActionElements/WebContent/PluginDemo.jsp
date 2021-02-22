<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>Plugin Demo Page, Where we are embeds the bean</H1>
<jsp:plugin code="Colour.class" codebase="com.bean.Colour" type="bean">
	<jsp:params>
		<jsp:param value="5" name="id" />
		<jsp:param value="red" name="nameofcolour" />
	</jsp:params>
</jsp:plugin>

</body>
</html>