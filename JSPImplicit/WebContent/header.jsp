<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
	int pageCount = 0;

	void addCount(){
		
		pageCount++;
	}

%>

<% addCount(); %>

<p>This is include directive example</p>
<p>This site has been visited <%=pageCount %> time.</p>

</body>
</html>