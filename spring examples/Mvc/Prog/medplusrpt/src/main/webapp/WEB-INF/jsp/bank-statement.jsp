<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Bank Statement</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Statements</h2>
		<form:form name="bankStatementForm" commandName="bankStatement">
			<span style="color:red;">
				<form:errors path="*"/>
			</span><br/>
			A/c no: <form:input path="acNo"/><br/>
			From Date (dd/MM/yyyy) : <form:input path="fromDate"/><br/>
			To Date (dd/MM/yyyy) :<form:input path="toDate"/><br/>
			<form:hidden path="reportType"/>
			<input type="submit" value="show"/>
		</form:form>
		<c:if test="${not empty transactions}">
			<table>
				<tr>
					<th>Transaction No</th>
					<th>Date</th>
					<th>Description</th>
					<th>Amount</th>
				</tr>
				<tr>
					<td colspan="4">Download <a href="javascript:report('pdf')">pdf</a> or <a href="javascript:report('xls')">xls</a></td>
				</tr>
				<c:forEach items="${transactions}" var="transaction">
					<tr>
						<td>${transaction.transactionNo}</td>
						<td><fmt:formatDate value="${transaction.transactionDate}" pattern="dd/MM/yyyy"/> </td>
						<td>${transaction.description}</td>
						<td>${transaction.amount} &nbsp; ${transaction.type}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<script type="text/javascript">
			function report(reportType) {
				document.getElementById("reportType").value = reportType;
				document.forms['bankStatementForm'].submit();
			}
		</script>
	</body>
</html>




















