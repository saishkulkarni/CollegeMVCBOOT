<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="x"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<h1>${msg}</h1>
<x:form action="/admin/login" method="post" modelAttribute="login">
Email:<input type="text" name="email" placeholder="Enter email" required="required"><br>
Password:<input type="text" name="password" placeholder="Enter password" required="required"><br>
<button type="reset">Cancel</button><button>Login</button>
</x:form>
<br>
<a href="/"><button>Home</button></a>
</body>
</html>