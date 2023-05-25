<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="x"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
	<h1>Enter Course Details</h1>
	<br>
	<x:form action="/admin/course" method="post">
Course Name: <input type="text" name="name">
		<br>
Course Fee: <input type="text" name="fee">
		<br>
Course Duration: <input type="number" name="duration">
		<br>
		<button type="reset">Cancel</button>
		<button>Add</button>
	</x:form>
	<br>
	<a href="/"><button>Home</button></a>
</body>
</html>