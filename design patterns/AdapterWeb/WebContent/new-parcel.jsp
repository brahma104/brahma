<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Parcel!</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		<form action="${pageContext.request.contextPath}/newParcel" method="post">
			From:
			<br/>
			Person : <input type="text" name="fromPerson"/><br/>
			Street Address : <input type="text" name="fromStreetAddress"/><br/>
			City : <input type="text" name="fromCity"/><br/>
			State : <input type="text" name="fromState"/><br/>
			Zip : <input type="text" name="fromZip"/><br/>
			Country : <input type="text" name="fromCountry"/><br style="border: 1px;"/>
			To:
			<br/>
			Person : <input type="text" name="toPerson"/><br/>
			Street Address : <input type="text" name="toStreetAddress"/><br/>
			City : <input type="text" name="toCity"/><br/>
			State : <input type="text" name="toState"/><br/>
			Zip : <input type="text" name="toZip"/><br/>
			Country : <input type="text" name="toCountry"/><br/>
			Parcel Information:
			Shippment Type : <intput type="text" name="shippmentType"/><br/>
			Weight : <input type="text" name="weight"/><br/>
			<input type="submit" value="book"/>
		</form>
	</body>
</html>
















