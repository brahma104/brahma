<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Receipt</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		Awb No : ${receipt.awbNo} <br/>
		Amount : ${receipt.amount} <br/>
		Estimated Delivery : ${receipt.estimatedDateOfDelivery}
	</body>
</html>