<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">All Vehicle</h1>
<hr/>
<table width="100%" border="1"> 
<tr>
<th>VehicleId</th>
<th>VechName</th>
<th>VechNo</th>
<th>OwnerName</th>
<th>Seats</th>
<th>Phone</th>
</tr>
<c:forEach var="vch" items="${vchlist }">
<tr>
	<td>${vch.Vid }</td>
	<td>${vch.VechName }</td>
	<td>${vch.VechNo }</td>
	<td>${vch.OwnerName }</td>
	<td>${vch.Seats }</td>
	<td>${vch.Phone }</td>
</tr>
</c:forEach>
</table>
</body>
</html>