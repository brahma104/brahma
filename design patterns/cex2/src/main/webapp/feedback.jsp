<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Feedback</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Customer Feedback</h2>
		<form action="${pageContext.request.contextPath}/feedbackhandler.action" method="post">
			Please provide the below details.<br/>
			
			Name: <input type="text" name="name"/><br/>
			Mobile No: <input type="text" name="mobileNo"/><br/>
			Email Address: <input type="text" name="emailAddress"/><br/>
			Message: <input type="text" name="message"/><br/>
			<input type="submit" value="submit"/>
		</form>
	</body>
</html>