<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="x"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Stream Details</h1>
	<br>
	<x:form action="/admin/stream" method="post">
Stream Name: <input type="text" name="name">
		<br>
Stream Fee: <input type="text" name="fee">
		<br>

		<button type="reset">Cancel</button>
		<button>Add</button>
	</x:form>
	<br>
	<a href="/"><button>Home</button></a>
</body>
</html>