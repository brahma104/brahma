<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Enrollment Request</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Enrollment Request</h2>
		<form action="${pageContext.request.contextPath}/newEnrollmentRequest" method="post">
			FirstName: <input type="text" name="firstName"/><br/>
			LastName: <input type="text" name="lastName"/><br/>
			Gender: <input type="text" name="gender"/><br/>
			Date Of Birth : <input type="text" name="dob"/><br/>
			Mobile : <input type="text" name="mobile"/><br/>
			Email Address: <input type="text" name="emailAddress"/><br/>
			Plan No: <input type="text" name="planNo"/><br/>
			Tenure: <input type="text" name="tenure"/><br/>
			Sum Insurred: <input type="text" name="sumInussurred"/><br/>
			
			Medical Record Date: <input type="text" name="medicalRecordDate"/><br/>
			Medical Test Name: <input type="text" name="medicalTestName"/><br/>
			Description:<input type="text" name="description"/><br/>
			Result: <input type="text" name="result"/><br/>
			<input type="submit" value="Enroll"/>
		</form>
	</body>
</html>