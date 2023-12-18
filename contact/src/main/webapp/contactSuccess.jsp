<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- <script
src="https://www.google.com/recaptcha/api.js?render=reCAPTCHA_site_key"></script>

<script src="https://www.google.com/recaptcha/api.js"></script> -->

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="contact">Contact</a>
				</li>
				</ul>
				</div>
				</nav>
				<h1>Details</h1>
				<h2>Name: ${name}</h2><br>
				<h2>Email: ${email}</h2><br>
				<h2>Mobile Number: ${mobileNumber}</h2><br>
				<h2>Comment: ${comment}</h2><br>

</body>
</html>