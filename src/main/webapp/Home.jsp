<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>${msg}</h1>
<h1>Welcome to Home page</h1><br>
<%if(session.getAttribute("admin")==null){ %>
<a href="/AdminLogin.jsp"><button>Click here to Login as Admin</button></a>
<%}else{ %>
<a href="/AddCourse.jsp"><button>Add Course</button></a><br>
<a href="/AddStream.jsp"><button>Add Stream</button></a><br>
<a href="/logout"><button>Logout</button></a>
<%} %>
</body>
</html>