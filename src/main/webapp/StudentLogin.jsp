<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentLogin</title>
</head>
<body>
<h1 style="color:green">${success}</h1>
<h1 style="color:red">${fail}</h1>
<form action="/student/login" method="post">
Email:<input type="text" name="email" placeholder="Enter email" required="required"><br>
Password:<input type="text" name="password" placeholder="Enter password" required="required"><br>
<button type="reset">Cancel</button><button>Login</button>
</form>
<br><br>
<a href="StudentSignup.jsp"><button>New? Click here to Create an Account</button></a>
<br>
<a href="/"><button>Home</button></a>
</body>
</html>