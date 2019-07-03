<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<div align="center">
		<h2>Edit Customer</h2>
		<form:form action="${pageContext.request.contextPath}/saveUser" method="POST"
		modelAttribute="user">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID:</td>
					<td>${user.id}<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input name="confirm" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>