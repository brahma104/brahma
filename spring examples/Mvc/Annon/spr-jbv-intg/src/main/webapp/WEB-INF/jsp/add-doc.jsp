<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Doctor</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Add Doctor</h2>
		<form:form modelAttribute="doctorForm">
			<span style="color: red;">
				<form:errors path="*"/>
			</span>
			<br/>
			Doctor Name: <form:input path="doctorName"/> <br/>
			Specialization: <form:input path="specialization"/><br/>
			Qualification: <form:input path="qualification"/><br/>
			Experience: <form:input path="experience"/><br/>
			Mobile :<form:input path="mobileNo"/><br/>
			Email Address: <form:input path="emailAddress"/>
			<input type="submit" value="add"/>
		</form:form>
	</body>
</html>



















