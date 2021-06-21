<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
	<div class=" conatiner bg-primary ">
		<h1 align="center" style="color: red">::Result Page::</h1>
		<h2>Data1::${data1}</h2>
		<hr>
		<h2>Data2(list)::${data2}</h2>
		<hr>
		<h2>Data3(set)::${data3}</h2>
		<hr>
		<h2>Data4(map)::</h2>
		<br>
		<c:forEach var="map" items="${data4}">
	   ${map.key}--->${map.value}
	</c:forEach>
		<hr>
		<h2>Data5(StudentDTO)::${data5}</h2>
		<br>
		<%-- <table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>MARKS</th>
			<th>SECTION</th>
		</tr>
		<tr bgcolor="cyan">
			<c:if test="${!empty data5}">
				<c:forEach var="dto" items="${data5} ">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.name}</td>
						<td>${dto.marks}</td>
						<td>${dto.section}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tr>
	</table> --%>
		<hr>
		<h2>Data6(array)::</h2>
		<br>
		<c:forEach var="arrval" items="${data6} ">
	    ${arrval}, 
	</c:forEach>

	</div>
</body>
</html>
