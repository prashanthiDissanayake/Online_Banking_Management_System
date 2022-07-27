<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">	
<title>Login</title>
	<style>
	
	body{
		font-family:curier;
	}
	
	</style>
</head>
<body>

	<h1>LOGIN PAGE</h1>
	<br>
	<br>
	<form action="login" method="post">
		User Name<input type="text" name="UserName" placeholder="enter your user name"><br>
		Password<input type="password" name="password" placeholder="enter your password"><br>
		<input type="submit" name="submit" value="Login">
	</form>

</body>
</html>