<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Staff</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Add Staff</h2>
		<form:form modelAttribute="addStaffForm">
		<span style="color:red;">
			<form:errors path="*"/>
			</span>
			<br/>
			First Name: <form:input path="firstName"/><br/>
			Last Name:<form:input path="lastName"/><br/>
			Gender: Male: <form:radiobutton path="gender" value="male"/> (or) Female: <form:radiobutton path="gender" value="female"/><br/>
			Date of Birth:<form:input path="dob"/><br/>
			Mobile: <form:input path="mobileNo"/><br/>
			Email Address:<form:input path="emailAddress"/><br/>
			Experience:<form:input path="experience"/><br/>
			<input type="submit" value="add"/>
		</form:form>
	</body>
</html>