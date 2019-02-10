<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<table>
	<c:forEach items="${notifications}" var="notification">
		<tr>
			<c:choose>
				<c:when test="${notification.status eq 'r'}">
					<td>${notification.notificationMessage}</td>
				</c:when>
				<c:otherwise>
					<td><b>${notification.notificationMessage}</b></td>
				</c:otherwise>
			</c:choose>
			
		</tr>
	</c:forEach>
</table>


