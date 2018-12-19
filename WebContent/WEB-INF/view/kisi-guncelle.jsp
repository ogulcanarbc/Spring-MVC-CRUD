<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Person</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<body>
	<div class="jumbotron">
	<h2>Update Person</h2>
	
	<div class="container">
		<form:form class="form-horizantal"  action="updatePerson" modelAttribute="getPerson" method="POST">
		<form:hidden path="id"/>
			<div class="form-group">
				<label for="firstName" class="col-sm-10 control-label">First Name:</label>
				<div>
					<form:input type="text" class="form-control" id="firstName" placehodler="First Name" path="firstName"></form:input>
				</div>
				
				<div class="form-group">
				<label for="lastName" class="col-sm-10 control-label">Last Name:</label>
				<div>
					<form:input type="text" class="form-control" id="lastName" placehodler="Last Name" path="lastName"></form:input>
				</div>
				
				<div class="form-group">
				<label for="email" class="col-sm-10 control-label">Email:</label>
				<div>
					<form:input type="text" class="form-control" id="email" placehodler="Email" path="email"></form:input>
				</div>
				
				<div class="form-group">
				<div>
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</div>
		</form:form>
	</div>
</div>
<br>
				<p> <a href="${pageContext.request.contextPath}/person/list">Go To Person List</a></p>

</body>
</html>