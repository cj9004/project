<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet"	href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/destinations.css" type="text/css">
	<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
	<title>Destinations</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<section class="searchSection">
		<div class="section">
			<h1 class="searchTitle">Find your perfect destination</h1>
			<div class="row">
				<div class="col-md-4">
					<div class="form-group ">
						<label for="origin">Country of origin</label>
						<select id="origin" class="form-control">
							<c:forEach var="c" items="${list}" >
								<option>${c}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group ">
						<label for="origin">Destination country</label>
						<select id="destination" class="form-control">
							<c:forEach var="c" items="${list}" >
								<option>${c}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group ">
						<label for="origin">Types of Vacations</label>
						<select id="destination" class="form-control">
							<c:forEach var="type" items="${listTypePlace}" >
								<option>${type}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<a href="search" class="btn btn-success btn-block">Search</a>						
		</div>
	</section>

</body>
</html>


