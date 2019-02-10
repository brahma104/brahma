<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Doctor</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<c:if test="${pageContext.request.userPrincipal.name ne ''}">
			<p align="left">
				Welcome! ${pageContext.request.userPrincipal.name} &nbsp; <a href="${pageContext.request.contextPath}/user-logout">logout</a>
			</p>
		</c:if>
		
		Welcome Admin!, You can add doctor
	</body>
</html>