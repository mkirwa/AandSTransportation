<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin form</title>
</head>
<body>
<spring:url value="/admin/save" var="saveURL"/>
	
	<form:form modelAttribute="adminForm" method="post" action="${saveURL}">
		<form:hidden path="idAdmin"/>
		<table>
			<tr>
				<td>FirstName:</td>
				<td>
				<form:input path="firstName"/>
				</td>
			</tr>
			<tr>
				<td>MiddleInitial:</td>
				<td>
				<form:input path="middleInitial"/>
				</td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input path="lastName"/>
			</tr>
			<tr>
				<td>address:</td>
				<td>
				<form:input path="Address"/>
				</td>
			</tr>
			<tr>
				<td>email:</td>
				<td>
				<form:input path="Email"/>
				</td>
			</tr>
			<tr>
				<td>phoneNumber:</td>
				<td><form:input path="PhoneNumber"/>
				</td>
			</tr>
			<tr>
				<td>race:</td>
				<td>
				<form:input path="Race"/>
				</td>
			</tr>
			<tr>
				<td>citizenship:</td>
				<td>
				<form:input path="Citizenship"/>
				</td>
			</tr>
			<tr>
				<td>drivingLicense:</td>
				<td>
				<form:input path="DrivingLicense"/>
				</td>
			</tr>
			<tr>
				<td>emergencyContactFirstName:</td>
				<td>
				<form:input path="EmergencyContactFirstName"/>
				</td>
			</tr>
			<tr>
				<td>emergencyContactLastName:</td>
				<td>
				<form:input path="EmergencyContactLastName"/>
				</td>
			</tr>
			<tr>
				<td>emergencyContactPhoneNumber:</td>
				<td>
				<form:input path="EmergencyContactPhoneNumber"/>
				</td>
			</tr>
			<tr>
				<td>username:</td>
				<td>
				<form:input path="Username"/>
				</td>
			</tr>
			<tr> 
				<td>password:</td>
				<td>
				<form:input path="Password"/>
				</td>
			</tr>
			<tr>
				<td>role:</td>
				<td>
				<form:input path="Role"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
				<button type="submit">Save</button>
				</td>
			</tr>
		</table>
	
	</form:form>
</body>
</html>