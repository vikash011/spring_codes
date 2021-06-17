<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result.jsp</title>
</head>
<body>
	<h2 align="center">All Counties List</h2>
	<hr>
	<%-- 	<c:choose>
		<c:when test="${!empty counytries_list}">
			<c:forEach var="country" items="${counytries_list}">
				<li>${country}</li>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<h3 align="center">No Countries To Retrieve</h3>
		</c:otherwise>
 --%>
	<c:choose>
		<c:when test="${!empty counytries_list}">
			<%--  if condition1 /case1 --%>

			<h1 style="color: red; text-align: center">All countries are</h1>
			<c:forEach var="country" items="${counytries_list}">
				<%-- enhanced for loop --%>
				<li><b>${country}</b></li>
			</c:forEach>

		</c:when>

		<c:otherwise>
			<%--  else condition or default --%>
			<h1 style="color: red; text-align: center">Not able to retrieve
				the countries</h1>
		</c:otherwise>

	</c:choose>
	
	<h3><a href="welcome.do">Home</a></h3>
</body>
</html>