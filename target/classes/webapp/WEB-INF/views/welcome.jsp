<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"	href="webjars/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet"	href="css/welcome.css">
<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<title>WELCOM3!</title>
</head>

<body class="bodyInit">
	<!-- 	Menu	 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home</a></li>
				<li class="nav-item dropdown">
					<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> Services </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="destinations">Find your Next Destination</a> 
						<a class="dropdown-item" href="estimations">Estimate your next vacations</a>
						<a class="dropdown-item" href="savePlan">Saving money plan</a>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Special Sales</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Contact us</a></li>
			</ul>
		</div>
	</nav>

	<!-- 	Sliders -->
	<h1 class="welcomeTittle">Welcome to your next Vacations</h1>
	<div class="slider">
		<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100" src="img/slider1.jpg" alt="First slide">
					<div class="carousel-caption d-none d-md-block">
						<h5>dfddfd..</h5>
						<p>..sdsd.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider2.jpg" alt="Second slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider3.jpg" alt="Third slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider4.jpg" alt="Third slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider5.jpg" alt="Third slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider6.jpg" alt="Third slide">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="img/slider7.jpg" alt="Third slide">
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
</body>
</html>


