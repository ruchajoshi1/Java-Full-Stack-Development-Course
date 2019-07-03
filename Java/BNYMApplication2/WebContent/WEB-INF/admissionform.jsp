<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- Form error -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Welcome to BNYM</h1>
		<h2>Recharge IT Application Portal</h2>
	</div>

	<form:errors path="applicant.*" />

	<form action="/BNYMApplication/submitform" method="POST">
		<table class="table">
			<tr>
				<td>Applicant's Name:</td>
				<td><input type="text" name="aName"></td>
			</tr>
			<tr>
				<td>Course:</td>
				<td><input type="text" name="aCourse"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="aMobile"></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><input type="date" name="aDOB"></td>
			</tr>
			<tr>
				<td>Skills:</td>
				<td><select multiple name="aSkills">
						<option value="Core Java">Core Java</option>
						<option value="HTML">HTML</option>
						<option value="CSS">CSS</option>
						<option value="JavaScript">JavaScript</option>
						<option value="SQL">SQL</option>
				</select></td>
			</tr>
			<tr>
				<td>Address:</td>
			</tr>
			<tr>
				<td>Street:</td>
				<td><input type="text" name="aAddress.street"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="aAddress.city"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="aAddress.state"></td>
			</tr>
			<tr>
				<td>Zip:</td>
				<td><input type="text" name="aAddress.zip"></td>
			</tr>
		</table>
		<input class="btn btn-success" type="submit" value="Submit">
	</form>
</body>
</html>