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

<h1 style="text-align:center">New Fare</h1>
<hr/>
<frm:form method="post" action="newcabfinfo" modelAttribute="cabf">
<p style="text-align:center">
<label>From Location: </label>
<frm:input type="text" path="FromLocation" placeholder="From Location"/>
<br/></br>
<label>To Location: </label>
<frm:input type="text" path="ToLocation" placeholder="To Location"/>
<br/><br/>
<label>Fare: </label>
<frm:input type="text" path="Fare" placeholder="Fare"/>
<br/><br/>

<input type="submit" value="Add Fare"/>
<br/><br/>
<h3 style="text-align:center"> ${info }</h3>
</p>
</frm:form>


</body>
</html>