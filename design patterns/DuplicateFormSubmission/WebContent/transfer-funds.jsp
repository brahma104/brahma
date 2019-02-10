<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Transfer Funds</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<form action="${pageContext.request.contextPath}/transferFunds" method="post">
			From A/c: <input type="text" name="fromAc"/><br/>
			To A/c: <input type="text" name="toAc"/><br/>
			Amount : <input type="text" name="amount"/><br/>
			Transfer Type: <input type="radio" name="transferType" value="neft"/> neft, <input type="radio" name="transferType" value="rtgs"/> rtgs, <input type="radio" name="transferType" value="imps"/> imps<br/>
			Remarks: <input type="text" name="remarks"/><br/>
			<input type="hidden" value="${cToken}" name="cToken"/>
			<input type="submit" name="transfer" value="transfer"/>
		</form>
	</body>
</html>