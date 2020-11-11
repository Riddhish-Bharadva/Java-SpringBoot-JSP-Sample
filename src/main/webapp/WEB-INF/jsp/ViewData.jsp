<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<title>Viewing all Data</title>
</head>
<body>
<div class="container" style="text-align:center;">
	<br>
	<hr>
	This page will display JSON data consumed using Endpoint: http://localhost:8085/DataController
	<c:if test="${fn:length(Data) == 0}">
		<hr>
		No Data consumed yet to display here.
		<hr>
	</c:if>
	<c:if test="${fn:length(Data) > 0}">
		<br>
		<br>
		<table class="table table-black">
			<thead>
				<tr>
					<th>User Id</th>
					<th>CurrencyFrom</th>
					<th>CurrencyTo</th>
					<th>AmountSell</th>
					<th>AmountBuy</th>
					<th>Rate</th>
					<th>TimePlaced</th>
					<th>OriginatingCountry</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Data}" var="values">
					<tr>
						<td>${values.userId}</td>
						<td>${values.currFrom}</td>
						<td>${values.currTo}</td>
						<td>${values.amountSell}</td>
						<td>${values.amountBuy}</td>
						<td>${values.rate}</td>
						<td>${values.timePlaced}</td>
						<td>${values.originCountry}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</div>
</body>
</html>