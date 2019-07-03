<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful!</title>
</head>
<body>
	<p>${msg}</p>
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/apply'" value="Apply" />
</body>
</html>