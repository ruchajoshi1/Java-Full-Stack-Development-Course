<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit applicant</title>
</head>
<body>
	<div align="center">
		<h2>Edit Customer</h2>
		<form:form action="${pageContext.request.contextPath}/save" method="POST"
		modelAttribute="applicant">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID:</td>
					<td>${applicant.id}<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="aName" /></td>
				</tr>
				<tr>
					<td>Course:</td>
					<td><form:input path="aCourse" /></td>
				</tr>
				<tr>
					<td>DOB:</td>
					<td><form:input path="aDOB" /></td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><form:input path="aMobile" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td>Street: <form:input path="aAddress.street" /></td>
					<td>City: <form:input path="aAddress.city" /></td>
					<td>State: <form:input path="aAddress.state" /></td>
					<td>Zip: <form:input path="aAddress.zip" /></td>
				</tr>
				<tr>
					<td>Skills:</td>
					<td><form:input path="aSkills" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>