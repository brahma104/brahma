<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>American Express Policies</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Policies</h2>
		<c:forEach items="${policies}" var="policy">
			policy name : ${policy.policyName} premium : ${policy.premiumAmount} <br/>
		</c:forEach>
	</body>
</html>