<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Applicant List</title>
	</head>
	<body>	
			<h3>List of all Applicants</h3>
			<br>
			<h3>Search hear!</h3>
			<form action="search" method="post">
				<input type="text" name="name" placeholder="Name"> &nbsp;
				<input type="text" name="city" placeholder="City"> &nbsp;
				<input type="submit" value="Search">
			</form>
			<h4>${noRecord}</h4>
			<h4>${recordFound}</h4>
			<h4>${allApplications}</h4>
			<br>
			<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Course</th>
				<th>Date of Birth</th>
				<th>Phone</th>
				<th>Address</th>
				<th>Skills</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${applicantList}" var="app">
				<tr>
					<td>${app.id}</td>
					<td>${app.aName}</td>
					<td>${app.aCourse}</td>
					<td>${app.aDOB}</td>
					<td>${app.aMobile}</td>
					<td>${app.aAddress.street},${app.aAddress.city},${app.aAddress.state},${app.aAddress.zip}</td>
					<td>${app.aSkills}</td> 
					<td><a href="${pageContext.request.contextPath}/edit?id=${app.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; 
						<a href="${pageContext.request.contextPath}/delete?id=${app.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<input type="button" onclick="location.href='${pageContext.request.contextPath}/'" value="Go Back Home" />
	</body>
</html>