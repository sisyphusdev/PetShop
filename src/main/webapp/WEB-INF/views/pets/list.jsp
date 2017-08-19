<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pet Shop - List</title>
</head>
<body>
	<h1>Pet List</h1>
	<table>
	<tr>
		<td>Pet Name</td>
		<td>Discription</td>
		<td>Pet type</td>	
	</tr>
	<c:forEach items="${pets}" var="pet">
	<tr>
		<td>${pet.name}</td>
		<td>${pet.description}</td>
		<td>${pet.type}</td>	
	</tr>
	</c:forEach>
	</table>
	<a href="/PetShop/">Return</a>
</body>
</html>