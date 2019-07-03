<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User List</title>
	</head>
	<body>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Email</th>
				<th>Password</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
					<td><a href="${pageContext.request.contextPath}/editUser?id=${user.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; 
						<a href="${pageContext.request.contextPath}/deleteUser?id=${user.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<input type="button" onclick="location.href='${pageContext.request.contextPath}/'" value="Go Back Home" />
	</body>
</html>