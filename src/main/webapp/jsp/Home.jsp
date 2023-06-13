<%@page import="org.jsp.jesa5.dto.Course"%>
<%@page import="java.util.List"%>
<%@page import="org.jsp.jesa5.dao.CourseDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="./css/home.css">
</head>
<body>
	<div class="navbar">
		<a class="active" href="/"><i class="fa fa-fw fa-home"></i> Home</a> <a
			href="#"><i class="fa fa-fw fa-search"></i> Search</a> <a href="#"><i
			class="fa fa-fw fa-envelope"></i> Contact</a> <a href="#"><i
			class="fa fa-fw fa-user"></i> Login</a>
	</div>
	<div class="header">
		<h1>JESA5 College</h1>
	</div>
	<div class="container">
		<div class="login-options">
			<ul>
				<li><a href="/jsp/AdminLogin.jsp">Login as Admin</a></li>
				<li><a href="/jsp/StudentLogin.jsp">Login as Student</a></li>
				<li><a href="/jsp/FacultyLogin.jsp">Login as Faculty</a></li>
				<li><a href="/jsp/StaffLogin.jsp">Login as Staff</a></li>
			</ul>
		</div>
	</div>
</body>
</html>