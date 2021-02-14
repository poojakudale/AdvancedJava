<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>JSP Demo</h2><br>
		 <% 
		
				String user = request.getParameter("unm");
				String password = request.getParameter("pwd");
				
				if(user.equals("Admin")&& password.equals("Admin@123")) {
			%> <h2>	Welcome Administrator</h2>
			<% }else{ %> <h2>Login Failed</h2><% } %>
</body>
</html>