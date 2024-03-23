<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center">New Vehicle</h1>
<hr/>
<frm:form method="post" action="newvchinfo" modelAttribute="vch">
<p style="text-align:center">
<label>Vehicle Name: </label>
<frm:input type="text" path="VechName" placeholder="Vehicle Name"/>
<br/></br>
<label>Vehicle Registration No: </label>
<frm:input type="text" path="VechNo" placeholder="Vehicle no"/>
<br/><br/>
<label>Owner: </label>
<frm:input type="text" path="OwnerName" placeholder="Owner Name"/>
<br/><br/>
<label>Seating: </label>
<frm:input type="text" path="Seats" placeholder="Seats"/>
<br/><br/>
<label>Phone No: </label>
<frm:input type="text" path="Phone" placeholder="Phone No"/>
<br/><br/>
<input type="submit" value="Add Vehicle"/>
<br/><br/>
<h3 style="text-align:center"> ${info }</h3>
</p>
</frm:form>


</body>
</html>