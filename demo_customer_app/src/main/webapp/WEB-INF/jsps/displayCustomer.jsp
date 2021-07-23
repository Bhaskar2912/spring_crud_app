<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Records</title>
</head>
<body>
<h2> All customer Details  </h2>
	<table border='1'>
		<tr>
			<th>id</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>City</th>
		</tr>
	<c:forEach items = "${Customer}" var="Customer">
		<tr>
			<td>${Customer.id}</td>
			<td>${Customer.firstname}</td>
			<td>${Customer.lastname}</td>
			<td>${Customer.city}</td>
		</tr>
</c:forEach>
	</table>
	<br/>
	<br/>

</body>
</html>