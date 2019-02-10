<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Medicines</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		<h1>Search Medicines</h1>
		<form action="${pageContext.request.contextPath}/do-search-medicines.htm" method="post">
			Medicine Name : <input type="text" name="medicineName"/> <br/>
			Manufacturer: <input type="text" name="manufacturer"/><br/>
			Expiry Month: <select name="expiryMonth">
							<c:forEach begin="1" end="12" var="expiryMonth">
								<option value="${expiryMonth}">${expiryMonth}</option>
							</c:forEach>
						  </select>
			Expiry Year: <select name="expiryYear">
							<c:forEach begin="2018" end="2025" var="expiryYear">
								<option value="${expiryYear}">${expiryYear}</option>
							</c:forEach>
						</select>
			<input type="submit" value="search"/>
		</form>
	</body>
</html>













