<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
		<link rel="stylesheet"
					href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

		<!-- jQuery library -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
		</script> 
</head>
<body>
	<h2>BNYM Application Page!</h2>
	<!--  
	<a href="/BNYMApplication/apply">Apply</a> 
	<a class="btn btn-primary" href="${pageContext.request.contextPath}/apply">Apply Here</a>
	-->
	<h3>Login</h3>
	<span style="color:red">${msg}</span>
	<form action="${pageContext.request.contextPath}/validateLogin" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" 
					placeholder="Email" required></td>
			 </tr>
			 <tr>
			    <td>Password:</td>
			    <td><input name="password" type="password" 
					placeholder="Password" required></td>
			  </tr>
			  <tr>
			  	<td></td>
			  	<td><input type="submit" value="Submit"></td>
			  </tr>
		</table>
	</form>
	<br>
	<input type="button" onclick="location.href='${pageContext.request.contextPath}/newUser'" value="Register" />
</body>
</html>