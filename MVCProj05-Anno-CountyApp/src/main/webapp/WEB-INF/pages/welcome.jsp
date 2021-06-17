<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	<h1 align="center" style="color: red">Welcome To Spring MVC(Home
		Page)</h1>
	<hr>
	<h2 align="center">
		<b>${sysdate}</b>
	</h2>
	<br>
	<br>
	<br>
	<br>
	<table>
		<tr>
			<td ><h2>
					<a href="countries_list">Get Countries Lists</a>
				||</h2></td>
			<td><h2>
					<a href="about">AboutUs</a>
				||</h2></td>
			<td><h2>
					<a href="contact">ContactUs</a>
				</h2></td>
		</tr>
	</table>
</body>
</html>