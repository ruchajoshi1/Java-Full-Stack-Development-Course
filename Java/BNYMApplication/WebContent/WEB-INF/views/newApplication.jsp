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
<style type="text/css">
.errormsg {
	color: red;
}
</style>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Welcome to BNYM</h1>
		<h2>Recharge IT Application Portal</h2>
	</div>

	<!-- <form:errors path="applicant.*" /> gives default error message -->

	<form:form action="${pageContext.request.contextPath}/saveApplication" method="POST"
		modelAttribute="applicant">
		<table class="table">
			<tr>
				<td>Applicant's Name:</td>
				<td><form:input type="text" path="aName" /> <small> <form:errors
							path="aName" cssClass="errormsg" />
				</small></td>
			</tr>
			<tr>
				<td>Course:</td>
				<td><form:input type="text" path="aCourse"/>
				<small> <form:errors
							path="aCourse" cssClass="errormsg" />
				</small></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input type="text" path="aMobile" /> <small>
						<form:errors path="aMobile" cssClass="errormsg" />
				</small></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><form:input type="date" path="aDOB" /> 
				<small>
						<form:errors path="aDOB" cssClass="errormsg" />
				</small>
				</td>
			</tr>
			<tr>
				<td>Skills:</td>
				<td><select multiple name="aSkills">
						<option value="Core Java">Core Java</option>
						<option value="HTML">HTML</option>
						<option value="CSS">CSS</option>
						<option value="JavaScript">JavaScript</option>
						<option value="SQL">SQL</option>
				</select>
				<small>
						<form:errors path="aSkills" cssClass="errormsg" />
				</small>
				</td>
			</tr>
			<tr>
				<td>Address:</td>
			</tr>
			<tr>
				<td>Street:</td>
				<td><form:input type="text" path="aAddress.street"/>
				<small>
						<form:errors path="aAddress.street" cssClass="errormsg" />
				</small>
				</td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input type="text" path="aAddress.city"/>
				<small>
						<form:errors path="aAddress.city" cssClass="errormsg" />
				</small>
				</td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input type="text" path="aAddress.state"/>
				<small>
						<form:errors path="aAddress.state" cssClass="errormsg" />
				</small>
				</td>
			</tr>
			<tr>
				<td>Zip:</td>
				<td><form:input type="text" path="aAddress.zip"/>
				<small>
						<form:errors path="aAddress.zip" cssClass="errormsg" />
				</small>
				</td>
			</tr>
		</table>
		<input class="btn btn-success" type="submit" value="Submit">
	</form:form>
</body>
</html>