<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Application received!</title>
	</head>
<body>
	<h2>Congratulations! BNYM has processed your application successfully!</h2>
	<h3>Applicant Details: </h3>
	Name:${applicant.aName}<br>
	Course:${applicant.aCourse}<br>
	Phone:${applicant.aMobile}<br>
	Date of Birth:<fmt:formatDate value="${applicant.aDOB}" pattern="MM/dd/yyyy"/><br>
	Skills:${applicant.aSkills}<br>
	Address:<br>
	Street:${applicant.aAddress.street}<br>
	City:${applicant.aAddress.city}<br>
	State:${applicant.aAddress.state}<br>
	Zip Code:${applicant.aAddress.zip}
	<hr>
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/showApplicants'" value="Show Applicants" />	
</body>
</html>