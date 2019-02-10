<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Login</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Member Login</h2>
		<p>
			Welcome to SBI Netbanking Console, please login to access your accounts.
		</p>
		<c:choose>
		<c:when test="${param.bad eq ''}">
			<p style="color: red;">
				Username/Password is invalid, please try again
			</p>
		</c:when>
		<c:when test="${param.disabled eq ''}">
			<p style="color: red;">
				Your account has been disabled, please contact administrator
			</p>
		</c:when>
		</c:choose>
		<form action="${pageContext.request.contextPath}/j-security-user-check"
			method="post">
			Username: <input type="text" name="j_username"/><br/>
			Password: <input type="password" name="j_password"/><br/>
			<input type="submit" value="login"/>
		</form>
	</body>
</html>