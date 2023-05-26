<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<h1>${msg}</h1>
<form action="/admin/login" method="post">
Email:<input type="text" name="email" placeholder="Enter email" required="required"><br>
Password:<input type="text" name="password" placeholder="Enter password" required="required"><br>
<button type="reset">Cancel</button><button>Login</button>
</form>
<br>
<a href="/"><button>Home</button></a>
</body>	
</html>