<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register</title>
</head>
<body>
	<div align="center">
		<h1 style="color: red">::Employee Registration::</h1>
		<hr>
		<table>
			<f:form action="welcome" modelAttribute="emp">
				<tr>
					<td>Employee ID::</td>
					<td><f:input path="empid" /></td>
				</tr>
				<tr>
					<td>Employee Name::</td>
					<td><f:input path="empName" /></td>
				</tr>
				<tr>
					<td>Employee SALARY::</td>
					<td><f:input path="empsal" /></td>
				</tr>
				<tr>
					<td>Employee JOB::</td>
					<td><f:input path="empJOB" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
					<td><input type="reset" /></td>
				</tr>
			</f:form>
		</table>

	</div>
</body>
</html>