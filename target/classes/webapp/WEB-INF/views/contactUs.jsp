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
<link rel="stylesheet" href="css/contactUs.css" type="text/css">
<link rel="stylesheet" href="css/emailSentModal.css" type="text/css">
<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
<script src="js/contactUs.js"></script>
<title>Contact Us!</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<div class="section">
		<h1 class="title animated bounce infinite">Contact us</h1>
		<form method="post" action="contactUs" class="form">
			<div class="form-group">
				<label for="email">Email:</label> 
				<input class="form-control"	type="email" class="form-control" id="email" placeholder="Enter email" name="email" required maxlength="30">
			</div>
			<div class="form-group">
				<label for="email">Subject:</label> 
				<input type="text" class="form-control" id="subject" placeholder="Enter subject" name="subject" required maxlength="30">
			</div>
			<div class="form-group">
				<label for="pwd">Message:</label>
				<textarea class="form-control" rows="5" id="message" name="message" maxlength="200" required></textarea>
			</div>
			<button type="submit" class="btn btn-success btn-block">Submit</button>
		</form>
	</div>
	<jsp:include page="emailSentModal.jsp" />
</body>
<script type="text/javascript">
var displayModal = '<c:out value="${displayModal}"/>';
</script>
</html>


