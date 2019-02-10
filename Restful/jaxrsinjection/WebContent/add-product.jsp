<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Product</title>
	</head>
	<body>
		<h2>Add Project</h2>
		<form action="${pageContext.request.contextPath}/api/product/dynamic" method="post">
			productName:<input type="text" name="productName"/><br/>
			description:<input type="text" name="description"/><br/>
			productType:<input type="text" name="productType"/><br/>
			price:<input type="text" name="price"/><br/>
			<input type="submit" value="add"/>
		</form>
	</body>
</html>