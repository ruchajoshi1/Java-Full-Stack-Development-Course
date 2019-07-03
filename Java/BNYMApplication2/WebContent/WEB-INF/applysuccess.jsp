<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Application Success!</title>
	</head>
<body>
	<h2>Congratulations! BNYM has processed your application successfully!</h2>
	<h3>Applicant Details: </h3>
	Name:${applicant.aName}<br>
	Course:${applicant.aCourse}<br>
	Phone:${applicant.aMobile}<br>
	Date of Birth:${applicant.aDOB}<br>
	Skills:${applicant.aSkills}<br>
	Address:<br>
	Street:${applicant.aAddress.street}<br>
	City:${applicant.aAddress.city}<br>
	State:${applicant.aAddress.state}<br>
	Zip Code:${applicant.aAddress.zip}	
</body>
</html>