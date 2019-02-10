<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Matching Medicines</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Medicines</h2>
		<c:forEach items="${medicines}" var="medicine">
			Medicine Name : ${medicine.medicineName} - Price - ${medicine.price}<br/>
		</c:forEach>
	</body>
</html>