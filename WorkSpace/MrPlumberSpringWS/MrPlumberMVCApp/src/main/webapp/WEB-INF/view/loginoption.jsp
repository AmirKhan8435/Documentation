<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Mr.Plumber</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" href="css/animate.css">

	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<link rel="stylesheet" href="css/magnific-popup.css">

	<link rel="stylesheet" href="css/flaticon.css">
	<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div class="wrap">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-12 col-md d-flex align-items-center">
					<p class="mb-0 phone"><span class="mailus">Phone no:</span> <a href="#">+91 1234 567</a> or <span
							class="mailus">email us:</span> <a href="#">mrplumber@123email.com</a></p>
				</div>
				<div class="col-12 col-md d-flex justify-content-md-end">
					<div class="social-media">
						<p class="mb-0 d-flex">
							<a href="#" class="d-flex align-items-center justify-content-center"><span
									class="fa fa-facebook"><i class="sr-only">Facebook</i></span></a>
							<a href="#" class="d-flex align-items-center justify-content-center"><span
									class="fa fa-twitter"><i class="sr-only">Twitter</i></span></a>
							<a href="#" class="d-flex align-items-center justify-content-center"><span
									class="fa fa-instagram"><i class="sr-only">Instagram</i></span></a>
							<a href="#" class="d-flex align-items-center justify-content-center"><span
									class="fa fa-dribbble"><i class="sr-only">Dribbble</i></span></a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<nav
		class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
		id="ftco-navbar">
		<div class="container">
			<a class="navbar-brand" href="index.html">Mr.Plumber</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#ftco-nav" aria-controls="ftco-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="fa fa-bars"></span> Menu
			</button>
			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a href="/index"
						class="nav-link">Home</a></li>
					<li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
					<li class="nav-item"><a href="services.html" class="nav-link">Services</a></li>
					<li class="nav-item"><a href="pricing.html" class="nav-link">Pricing</a></li>
					<li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>

					<li class="nav-item"><a href="/plumberDashbord"
						class="nav-link">Plumber Dashboard</a></li>
					<li class="nav-item"><a href="/customerDashbord"
						class="nav-link">Customer Dashboard</a></li>
					<li class="nav-item"><a href="/signin2" class="nav-link">Login</a></li>
					
					<li class="nav-item"><a href="/logout" class="nav-link">logout</a></li>
					
					<!-- <button type="button" class="btn btn-primary btn-lg show-modal" data-toggle="modal" data-target="#myModal">
						Login Form
					  </button> -->
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->
	<div class="hero-wrap js-fullheight" style="background-image: url('images/index2.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="row no-gutters slider-text js-fullheight align-items-center justify-content-start"
				data-scrollax-parent="true">
				<div class="col-md-6 ftco-animate">
					<h2 class="subheading">Leave the plumbing chores to us</h2>
					<h1 class="mb-4"
						style="font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif; color:black;">If
						you consider the contribution of plumbing to human life, the other sciences fade into
						insignificance.</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-appointment ftco-section ftco-no-pt ftco-no-pb">
		<div class="overlay"></div>
		<div class="container">
			<div class="row d-md-flex justify-content-center">
				<div class="col-md-12">
					<div class="wrap-appointment bg-white d-md-flex pl-md-4 pb-5 pb-md-0">
						
							<div class="row justify-content-center">

							</div>
					</div>
				</div>
				<center>
					<form action="/signincustumer" class="appointment w-100">

					<div class="col-12 col-md d-flex align-items-center align-items-stretch">
						<div class="form-group py-md-4 py-2 px-4 px-md-0 d-flex align-items-stretch bg-primary">
							<input type="submit" value="As Customer" class="btn btn-primary py-3 px-4">

						</div>
					</div>
				</form>
				</center>
				

                <center>
				<form action="/signinplumber" class="appointment w-100">

					<div class="col-12 col-md d-flex align-items-center align-items-stretch">
						<div class="form-group py-md-4 py-2 px-4 px-md-0 d-flex align-items-stretch bg-primary">
							<input type="submit" value="As Plumber" class="btn btn-primary py-3 px-4">

				

			</div>


		</div>
	</form>
</center>
		</div>
		</div>
		</div>
	</section>




	<footer class="footer ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
					<h2 class="footer-heading">Mr. Plumber</h2>
					<p>If you consider the contribution of plumbing to human life, the other sciences fade into
						insignificance..</p>
					<ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-4">
						<li class="ftco-animate"><a href="#"><span class="fa fa-twitter"></span></a></li>
						<li class="ftco-animate"><a href="#"><span class="fa fa-facebook"></span></a></li>
						<li class="ftco-animate"><a href="#"><span class="fa fa-instagram"></span></a></li>
					</ul>
				</div>

				<div class="col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0">
					<h2 class="footer-heading">Quick Links</h2>
					<ul class="list-unstyled">
						<li><a href="#" class="py-1 d-block">Home</a></li>
						<li><a href="#" class="py-1 d-block">About</a></li>
						<li><a href="#" class="py-1 d-block">Services</a></li>
						<li><a href="#" class="py-1 d-block">Works</a></li>
						<li><a href="#" class="py-1 d-block">Blog</a></li>
						<li><a href="#" class="py-1 d-block">Contact</a></li>
					</ul>
				</div>
				<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
					<h2 class="footer-heading">Have a Questions?</h2>
					<div class="block-23 mb-3">
						<ul>
							<li><span class="icon fa fa-map-marker"></span><span class="text">Mumbai Maharashtra</span>
							</li>
							<li><a href="#"><span class="icon fa fa-phone"></span><span
										class="text">+91-123456789</span></a></li>
							<li><a href="#"><span class="icon fa fa-paper-plane"></span><span
										class="text">mrplumber@123@gmail.com</span></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</footer>



	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10"
				stroke="#F96D00" />
		</svg></div>


	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/scrollax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>

</body>

</html>