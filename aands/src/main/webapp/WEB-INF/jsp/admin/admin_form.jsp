<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin form</title>
</head>
<body>
	<spring:url value="/save" var="saveURL"/>
	
	<form:form modelAttribute="adminForm" method="POST" action="${saveURL }">
	
		<table>
			<tr>
				<td>FirstName:</td>
				<td><form:input path="firstName"/>
			</tr>
			<tr>
				<td>MiddleInitial:</td>
				<td><form:input path="middleInitial"/>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input path="lastName"/>
			</tr>
			<tr>
				<td>address:</td>
				<td><form:input path="Address"/>
			</tr>
			<tr>
				<td>email:</td>
				<td><form:input path="Email"/>
			</tr>
			<tr>
				<td>phoneNumber:</td>
				<td><form:input path="PhoneNumber"/>
			</tr>
			<tr>
				<td>race:</td>
				<td><form:input path="Race"/>
			</tr>
			<tr>
				<td>citizenship:</td>
				<td><form:input path="Citizenship"/>
			</tr>
			<tr>
				<td>drivingLicense:</td>
				<td><form:input path="DrivingLicense"/>
			</tr>
			<tr>
				<td>emergencyContactFirstName:</td>
				<td><form:input path="EmergencyContactFirstName"/>
			</tr>
			<tr>
				<td>emergencyContactLastName:</td>
				<td><form:input path="EmergencyContactLastName"/>
			</tr>
			<tr>
				<td>emergencyContactPhoneNumber:</td>
				<td><form:input path="EmergencyContactPhoneNumber"/>
			</tr>
		</table>
	
	</form:form>
</body>
</html>