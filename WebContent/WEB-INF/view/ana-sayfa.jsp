<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Spring Crud</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<body>
	<div class="jumbotron">
	<h2>Personnel System</h2>
	<button class="btn btn-primary" onclick="window.location.href='showPersonForm'; return false" type="button" role="button">Add Person</button>
	<div class="container">
<table class="table table-striped">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update / Delete</th>
		</tr>

	<c:forEach var="listPerson" items="${listPersons}">
		<tr>
			<td>${listPerson.firstName}</td>
			<td>${listPerson.lastName}</td>
			<td>${listPerson.email}</td>
			<td><button type="button" class="btn btn-warning" role="button" onclick="window.location.href='showFormUpdatePerson?PersonId=${listPerson.id}'; return false" >Update</button>
			<button type="button" class="btn btn-danger" role="button" onclick="window.location.href='deletePerson?PersonId=${listPerson.id}'; return false">Delete</button></td>
		
		</tr>
	</c:forEach>
	</table>
	</div>
</div>

</body>
</html>