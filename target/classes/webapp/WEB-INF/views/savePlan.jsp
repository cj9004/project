<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"	href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/savePlan.css" type="text/css">

<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
<title>Save Money Plan</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<div class="section">
	<h1 class="title"> Calculate your payment plan</h1>
	<p>Please select the tourism plan that you wish and then press calculate button to see the total price.   </p>
		<form method="post" action="calculatePlan" class="form">
			<div class="row">
				<div class="col-md-4">
					<div class="form-group ">
						<label>Country Plan</label>
						<select	name="plan" class="form-control">
							<c:forEach var="c" items="${listPlan}">
								<option value="${c.id}">${c.countryOrigin.name}-${c.countryDestination.name}-${c.description} </option>
							</c:forEach>
						</select>
					</div>
				</div>				
				<div class="col-md-4">
					<div class="form-group ">
						<label>How many people</label>
						<input type="text" name="people" class="form-control">
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group ">
						<label>How many months</label>
						<input type="text" class="form-control" name="months">
					</div>
				</div>
			</div>
			<button class="btn btn-success btn-block">Calculate</button>
		</form>
	</div>