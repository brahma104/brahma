<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Techinician/CSR Login</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Technician/CSR Login</h2>
		<form action="${pageContext.request.contextPath}/csr-security-check" method="post">
			Username: <input type="text" name="j_user"/>
			<br/>
			Password : <input type="password" name="j_password"/>
			<br/>
			<input type="submit" value="login"/>
		</form>
	</body>
</html>