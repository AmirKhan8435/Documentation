<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<body>
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

<table class="table">
    <thead class="bg-primary">
      <tr>
        <th scope="col">#</th>
        <th scope="col">Service Name</th>
        <th scope="col">Workplace</th>
        <th scope="col">Date</th>
        <th scope="col">Time</th>
        <th scope="col">Plumber Name</th>
        <th scope="col">Status</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>${services}</td>
        <td>${custDash.getWorkAddress() }</td>
        <td>${custDash.getBookingDate() }</td>
        <td>${custDash.getWorkTime() }</td>
        <td>${name }</td>
        <td>${custDash.getBookingStatus() }</td>
        <td></td>
      </tr>
      
    </tbody>
  </table>
  
 
    </body>