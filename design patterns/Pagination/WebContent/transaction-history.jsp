<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Transaction History</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;" onload="initialize();">
		<h2>Transaction History</h2>
		<form name="transactionHistoryForm" action="${pageContext.request.contextPath}/transactionHistory" method="post">
			<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}"/>
			<input type="hidden" id="sortColumn" name="sortColumn" value="${sortColumn}"/>
			<input type="hidden" id="sortOrder" name="sortOrder" value="${sortOrder}"/>
			<input type="hidden" id="action" name="action" value=""/>

			<table>
				<tr>
					<td colspan="2">
						<table border="1">
							<tr>
								<th><a href="javascript:sort('transaction_dt')"
									style="text-decoration: none;"> Transaction Date <c:choose>
											<c:when
												test="${sortColumn eq 'transaction_dt' and sortOrder eq 'asc'}">
												<span style="color: red;">(a^)</span>
											</c:when>
											<c:when
												test="${sortColumn eq 'transaction_dt' and sortOrder eq 'desc'}">
												<span style="color: red;">(d^)</span>
											</c:when>
										</c:choose>
								</a></th>
								<th>Description</th>
								<th><a href="javascript:sort('merchant_nm')"
									style="text-decoration: none;"> Merchant <c:choose>
											<c:when
												test="${sortColumn eq 'merchant_nm' and sortOrder eq 'asc'}">
												<span style="color: red;">(a^)</span>
											</c:when>
											<c:when
												test="${sortColumn eq 'merchant_nm' and sortOrder eq 'desc'}">
												<span style="color: red;">(d^)</span>
											</c:when>
										</c:choose>
								</a></th>
								<th>Amount</th>
							</tr>
							<c:forEach items="${transactions}" var="transaction">
								<tr>
									<td>${transaction.transactionDate}</td>
									<td>${transaction.description}</td>
									<td>${transaction.merchant}</td>
									<td>${transaction.amount}</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
				<tr>
					<td align="left">
						<select id="pageSize" name="pageSize" onchange="goPageSize();">
							<option value="5">5</option>
							<option value="10">10</option>
							<option value="15">15</option>
						</select>
						<c:if test="${currentPage gt 1}">
							<input type="button" value="&lt;&lt;" onclick="go('first');"/>
							&nbsp;
							<input type="button" value="&lt;" onclick="go('prev');"/>
						</c:if>
					</td>
					<td align="right">
						<c:if test="${currentPage lt totalPages}">
							<input type="button" value="&gt;" onclick="go('next');"/>
							&nbsp;
							<input type="button" value="&gt;&gt;" onclick="go('last');"/>
						</c:if>
					</td>
				</tr>			
			</table>
		</form>
		<script type="text/javascript">
			function initialize() {
				var pageSizeSelect = null;
				var pageSizeOptions = null;
				var pageSize = null;
				var i =0;
				var opt = null;
				
				pageSize = "${pageSize}";
				pageSizeSelect = document.getElementById("pageSize");
				pageSizeOptions = pageSizeSelect.options;
				for(i=0;i<pageSizeOptions.length;i++) {
					opt = pageSizeOptions[i];
					if(opt.value == pageSize) {
						opt.selected = "selected";
						break;
					}
				}
			}
		
			function sort(col) {
				var sortColumn = null;
				var sortOrder = null;
				var currentPage = null;
				var action = null;

				sortColumn = document.getElementById("sortColumn");
				sortOrder = document.getElementById("sortOrder");
				currentPage =document.getElementById("currentPage");
				action = document.getElementById("action");
				action.value ='sort';
				
				// change in sort column
				if(sortColumn.value != col) {
					currentPage.value=1;
					sortColumn.value=col;
					sortOrder = 'asc';
				}else {
					currentPage.value=1;
					if(sortOrder.value == 'asc') {
						sortOrder.value='desc';
					}else {
						sortOrder.value = 'asc';
					}
				}
				document.forms['transactionHistoryForm'].submit();
			}			
			function goPageSize() {
				var currentPage = null;
				var action = null;

				currentPage =document.getElementById("currentPage");
				action = document.getElementById("action");
				currentPage.value = 1;
				action.value = 'pageSize';
				document.forms['transactionHistoryForm'].submit();
			}
			function go(op) {
				var action = null;
				action = document.getElementById("action");
				action.value=op;
				document.forms['transactionHistoryForm'].submit();							
			}
		</script>
	</body>
</html>






































