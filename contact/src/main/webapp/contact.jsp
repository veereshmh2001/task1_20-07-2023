<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
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
				</ul>
				</div>
				</nav>
				<form action="contactInfo" method="post" class="container">
<h1>Information</h1>
<div class="container">
<label for="name">Name</label>
<input type="text"  id="floatingInput" name="name" placeholder="Enter name">
</div>
<br>
<div class="container">
<label for="email">E-mail</label>
<input type="email"  id="floatingInput" name="email" placeholder="Enter email">
</div>
<br>
<div class="container">
<label for="mobileNumber">Mobile Number</label>
<input type="number"  id="floatingInput" name="mobileNumber" placeholder="Enter Mobile Number">
</div>
<br>
<div class="container">
<label for="comment">Comment</label>
<input type="text"  id="floatingInput" name="comment" placeholder="">
</div>
<br>
<input type="submit" value="Send" class="btn btn-primary">	
</form>

</body>
</html>