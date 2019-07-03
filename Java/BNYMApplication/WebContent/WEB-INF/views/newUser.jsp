<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registration</title>
	</head>
	<body>
		<h2>Registration form. Asterisk indicates required field.</h2>
		<h3>${msg}</h3>
		<form action="${pageContext.request.contextPath}/saveUser"
			method="POST">
			<table>
			  <tr>
			    <td>Email*:</td>
			    <td><input type="email" name="email" 
					placeholder="Email" required></td>
			  </tr>
			  <tr>
			    <td>Password*:</td>
			    <td><input name="password" type="password" 
					pattern="^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$" 
					placeholder="Password (at least 1 letter and 1 number)" required></td>
			  </tr>
			  <tr>
			    <td>Confirm password*:</td>
			    <td><input name="confirm" type="password"
					pattern="^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$" 
					placeholder="Confirm password" required></td>
			  </tr>
			  <tr>
			  	<td>
			  	<input type="submit" value="Submit">
			  	</td>
			  </tr>
			</table>
		</form>
	</body>
</html>