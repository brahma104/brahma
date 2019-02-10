<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Recharge</title>
	</head>
	<body>
		<h2>Recharge through pay balance</h2>
		<form action="recharge" method="post">
			Mobile No: <input type="text" name="mobileNo"/><br/>
			Provider :  <select name="provider">
							<option value="airtel">Airtel</option>
							<option value="idea">Idea</option>
							<option value="jio">Jio</option>
							<option value="vodafone">Vodafone</option>
						</select><br/>
			Subscriber Type: Prepaid: <input type="radio" name="subcriberType" value="prepaid"/> (or) 
							Postpaid: <input type="radio" name="subscriberType" value="postpaid"/><br/>
			Payment Type: Amazon Pay balance
							<input type="hidden" name="paymentType" value="Amazon Pay balance"/><br/>
			Amount: <input type="text" name="amount"/><br/>
			<input type="submit" value="recharge"/>
		</form>
	</body>
</html>







