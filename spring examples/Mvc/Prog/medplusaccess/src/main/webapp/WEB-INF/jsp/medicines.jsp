<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Medines</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Medines</h2>
		<table>
			<tr>
				<th>Medicine Name</th>
				<th>Manufacturer</th>
				<th>Price</th>
				<th>quantity</th>
			</tr>
			<c:forEach items="${medicines}" var="medicine">
				<tr>
					<td>${medicine.medicineName}</td>
					<td>${medicine.manufacturer}</td>
					<td>${medicine.price}</td>
					<td>${medicine.quantity}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>




















