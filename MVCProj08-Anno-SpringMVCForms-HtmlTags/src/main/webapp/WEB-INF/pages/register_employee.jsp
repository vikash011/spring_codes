<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<form  method="post">

			<table>
				<tr>
					<td>Employee ID::</td>
					<td><input type="text" name="empid" /></td>
				</tr>
				<tr>
					<td>Employee Name::</td>
					<td><input type="text" name="empName" /></td>
				</tr>
				<tr>
					<td>Employee SALARY::</td>
					<td><input type="text" name="empsal" /></td>
				</tr>
				<tr>
					<td>Employee JOB::</td>
					<td><input type="text" name="empJOB" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
					<td><input type="reset" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>