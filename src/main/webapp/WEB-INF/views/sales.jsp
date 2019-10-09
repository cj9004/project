<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet"	href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/sales.css" type="text/css">
	<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
	<title>Sales</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<h1 class="title">Special Sales</h1>
	<div class="row">
    	<div class="salesCol">
    		<img src="img/sales.jpg">
    	</div>
    	<div class="salesCol">
    		<table class="table table-striped table-hover">
    			<tbody>
				<c:forEach var="desc" items="${salesList}" >
					<tr>
				      <td>${desc}</td>
				    </tr>								
				</c:forEach>
				</tbody>
			</table>
    	</div>
  	</div>
	
</body>
</html>