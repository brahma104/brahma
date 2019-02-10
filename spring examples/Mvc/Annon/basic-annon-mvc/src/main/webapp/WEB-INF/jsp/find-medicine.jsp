<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Medicine</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Find Medicine</h2>
		<form action="${pageContext.request.contextPath}/do-find-medicine.htm" method="post">
			Medicine Name: <input type="text" name="medicineName"/> <br/>
			<input type="submit" value="Find"/>
		</form>
	</body>
</html>