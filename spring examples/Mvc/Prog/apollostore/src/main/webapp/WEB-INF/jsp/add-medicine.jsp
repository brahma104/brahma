<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Medicine</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Add Medicine</h2>
		<form:form commandName="addMedicineCommand">
			<span style="color: red;">
				<form:errors path="*"/>
			</span><br/>
			Medicine Name: <form:input path="medicineName"/> <br/>
			Manufacturer: <form:input path="manufacturer"/> <br/>
			Expiry Month : <form:select path="expiryMonth">
							 <c:forEach begin="1" end="12" var="c">
							 	<form:option value="${c}">${c}</form:option>
							 </c:forEach>
						   </form:select><br/>
			Expiry Year: <form:select path="expiryYear">
							<c:forEach begin="2018" end="2025" var="c">
								<form:option value="${c}">${c}</form:option>
							</c:forEach>
						</form:select><br/>
			Price : <form:input path="price"/> <br/>
			Quantity: <form:input path="quantity"/><br/>
			<input type="submit" value="Add"/>
		</form:form>
	</body>
</html>















