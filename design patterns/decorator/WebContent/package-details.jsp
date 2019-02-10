<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		Package name : <b>${dthPackage.packageName}</b><br/>
		Channels:
		<c:forEach items="${dthPackage.channels}" var="channel">
			${channel.identityName}&nbsp;,&nbsp; 
		</c:forEach>
		<br/>
		Amount: ${dthPackage.amount}	
	</body>
</html>