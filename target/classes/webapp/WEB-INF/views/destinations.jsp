<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/destinations.css" type="text/css">
<link rel="stylesheet" href="css/modalInfo.css" type="text/css">
<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
<script src="js/destinations.js"></script>
<title>Find your perfect destination</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<form method="post" action="destinations" class="searchSection">
		<div class="section">
			<h1 class="searchTitle">Find your perfect destination</h1>
			<div class="row">
				<div class="col-md-4">
					<div class="form-group ">
						<label for="originLabel">Country of origin</label> <select
							id="origin" name="origin" class="form-control">
							<c:forEach var="c" items="${list}">
								<option value="${c.id}">${c.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group ">
						<label for="destinationLabel">Destination country</label> 
						<select	id="destination" name="destination" class="form-control">
							<c:forEach var="c" items="${list}">
								<option value="${c.id}">${c.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group ">
						<label for="typeLabel">Types of Vacations</label> <select
							id="type" name="type" class="form-control">
							<c:forEach var="type" items="${listTypePlace}">
								<option value="${type.id}">${type.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<button class="btn btn-success btn-block">Search</button>
		</div>
	</form>
	<div class="section">
		<table class="table table-striped table-hover" id="destinationTable">
			<thead>
				<tr>
					<th scope="col">Country of Origin</th>
					<th scope="col">Destination</th>
					<th scope="col">Plan Description</th>
					<th scope="col">Type</th>
					<th scope="col">Price</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${countryPlan !=null}">
						<c:forEach var="plan" items="${countryPlan}">
							<tr>
								<td>${plan.countryOrigin.name}</td>
								<td>${plan.countryDestination.name}</td>
								<td>${plan.description}</td>
								<td>${plan.placeType.name}</td>
								<td>${plan.price}</td>
							</tr>
						</c:forEach>
					</c:when>
				</c:choose>
			</tbody>
		</table>
	</div>
	<jsp:include page="modalInfo.jsp" />
</body>

<script type="text/javascript">
var message = '<c:out value="${message}"/>';
</script>
</html>


