<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>

</tr>
<a:forEach var="item" items="${temp}">
<tr>
<td>${item.cId}</td>
<td>${item.name}</td>
<td>${item.salary}</td>

<td><a href="enroll">Enroll</a></td>
</tr>
</a:forEach>
</table>
</body>
</html>