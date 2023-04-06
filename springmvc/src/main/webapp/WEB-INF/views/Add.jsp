<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp" />
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
<style type="text/css">
body {
	background-image:
		url('https://www.xmple.com/wallpaper/linear-blue-white-highlight-gradient-1920x1080-c2-ffffff-e0ffff-l-50-a-165-f-21.svg');
	background-size: 100%;
}
</style>
</head>
<body>

	<div align="center">
		<form action="./add" method="post">
			<fieldset>
				<legend>:::Add Employee:::</legend>
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"></td>
					</tr>
					<tr>
						<td>Designation</td>
						<td><input type="text" name="designation"></td>
					</tr>
					<tr>
						<td>Salary</td>
						<td><input type="text" name="salary"></td>
					</tr>
				</table>
			</fieldset>
			<input id="button" type="submit" value="Add">
			<%
			if (msg != null) {
			%>
			<h3>
				<%=msg%>
			</h3>
			<%
			}
			%>
		</form>
	</div>

</body>
</html>