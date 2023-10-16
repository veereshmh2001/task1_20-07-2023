<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar" style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
			</div>
		</div>
	</nav>
	<form action="Add" method="post" class="conyainer">
	<h1>Register Form</h1>
	<div class="design">
    <label for="buildNo" class="form-label">Building Number</label><br>
    <input type="number" class="form-control" id="buildNo" name="number">
  </div><br>
  
  <div class="design">
    <label for="street" class="form-label">Street</label><be>
    <input type="text" class="form-control" id="street" name="street">
  </div><br>
  
  <div class="design">
    <label for="city" class="form-label">City</label><br>
    <input type="text" class="form-control" id="city" name="city">
  </div><br>
  
  <div class="design">
    <label for="state" class="form-label">State</label><br>
    <input type="text" class="form-control" id="state" name="state">
  </div><br>
  
  <div class="design">
    <label for="country" class="form-label">Country</label><br>
    <input type="text" class="form-control" id="country" name="country">
  </div><br>
  
  <div class="button">
  <button type="submit" class="btn btn-primary">Register</button>
  
  </div>
  
  </form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
		

</body>
</html>