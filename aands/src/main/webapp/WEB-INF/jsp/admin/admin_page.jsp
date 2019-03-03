<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin page</title>
</head>
<body>

<h1>Admin List</h1>
<table width="100%" border="1">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th colspan="2">Action</th>
	</tr>
	<c:forEach items="${listAdmin}" var="admin">
		<tr>
			<td>${admin.idAdmin}</td>
			<td>${admin.firstName}</td>
			<td>${admin.middleInitial}</td>
			<td>${admin.lastName}</td>
			<td>${admin.Address}</td>
			<td>${admin.Email}</td>
			<td>${admin.PhoneNumber}</td>
			<td>${admin.Race}</td>
			<td>${admin.Citizenship}</td>
			<td>${admin.DrivingLicense}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>