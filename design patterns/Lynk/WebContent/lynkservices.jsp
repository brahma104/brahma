<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lynk Services</title>
		<script type="text/javascript">
			function showServices(serviceType) {
				var divElements = null;
				divElements = document.getElementsByTagName("div");
				for(var i=0;i<divElements.length;i++) {
					divElements[i].style.display = "none";
				}
				document.getElementById(serviceType).style.display="block";
			}
		</script>
	</head>
	<body style="font-family: consolas; font-size: 18px;">
		<table>
			<tr>
				<td colspan="2">
					Choose a Service
				</td>
			</tr>
			<tr>
				<td>
					Transport Service : <input type="radio" name="lynkservices" value="transport" onclick="showServices('transport')"/>
				</td>
				<td>
					Machinery Service : <input type="radio" name="lynkservices" value="machinery" onclick="showServices('machinery')"/>
				</td>
			</tr>
		</table>
		<table>
			<!-- Transport Form -->
			<tr>
				<td>
					<div id="transport" style="display: none;">
						<form name="transportForm" action="${pageContext.request.contextPath}/transportServices" method="post">
							Partner: <select name="tpspartner">
										<option value="ashoka">Ashoka</option>
										<option value="srmt">SRMT</option>
									</select><br/>
							Source : <input type="text" name="source"/><br/>
							Destination : <input type="text" name="destination"/><br/>
							Hire Date (dd/mm/yyyy): <input type="text" name="hireDate"/><br/>
							Purpose: <input type="text" name="purpose"/><br/>
							Person: <input type="text" name="tpsPerson"/><br/>
							Mobile: <input type="text" name="tpsMobile"/><br/>
							Email : <input type="text" name="tpsEmail"/><br/>
							<input type="submit" value="hire">
						</form>
					</div>
				</td>
			</tr>
			<!-- Machinery Form -->
			<tr>
				<td>
					<div id="machinery" style="display:none;">
						<form name="machineryForm" action="${pageContext.request.contextPath}/machineryServices" method="post">
							Partner: <select name="mpspartner">
										<option value="ashoka">Ashoka</option>
										<option value="srmt">SRMT</option>
									</select><br/>
							Area: <input type="text" name="area"/><br/>
							Machinery Type: <select name="machineryType">
												<option value="cranes">Cranes</option>
												<option value="jcb">Jcb</option>
											</select><br/>
							Hours : <input type="text" name="hours"/><br/>
							Person: <input type="text" name="mpsPerson"/><br/>
							Mobile: <input type="text" name="mpsMobile"/><br/>
							Email : <input type="text" name="mpsEmail"/><br/>
							<input type="submit" value="hire">
						</form>
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>










