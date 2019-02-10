<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Choose Package</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		<h2>Choose Package</h2>
		<form action="${pageContext.request.contextPath}/choosepackage" method="post">
			Packages : <select name="package">
				<option value="south super value">south super value</option>
				<option value="north super value">north super value</option>
			</select><br /> Top up:<br /> Sports :<input type="checkbox" value="sports"
				name="topup" /><br /> Kids: <input type="checkbox" value="kids"
				name="topup" />
			<input type="submit" value="estimate"/>
		</form>
</body>
</html>