<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 
</head>
<style>
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
        }
        
        .design {
            margin: 10px 0;
        }

        .btn-primary {
            background-color: #007BFF;
            color: #fff;
            border: none;
        }
        label{
        font-weight:bold;
        }
    </style>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">Home<img src="xworkz.png"
			width="100" height="40" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="bakery.jsp">Bakery</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="bakeryDisplay.jsp">Display</a></li>			
	</nav>
      <form action="tasty" method="post" class="container">
	<h1>Bakery Application</h1>
			<div class="design">
			<label for="name">Item Name</label>
				<input type="text" class="form-control" id="floatingInput" name="name" placeholder="Enter item name">		
			</div>
			<div class="design">
			<label for="price">Item Price</label>
				<input type="number" class="form-control" id="floatingInput" name="price" placeholder="Ex.10000000">		
			</div>
			<div class="design">
				<label for="quantity">Quantity</label>
				<select class="form-select" name="quantity">
					<option selected>Choose</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
					<option>7</option>
					<option>8</option>
					<option>9</option>
					<option>10</option>
				</select>
			</div>
			<div class="design">
				<label for="discount">Discount in %</label>
				<select class="form-select" name="discount" placeholder="in %">
					<option selected>Choose</option>
					<option>5</option>
					<option>10</option>
					<option>15</option>
					<option>20</option>
					<option>50</option>
					<option>75</option>
					<option>100</option>
				</select>
			</div>
			<div class="design">
			<label for="working">GST in rupees</label>
				<input type="number" class="form-control" id="floatingInput" name="gst" placeholder="Enter here">		
			</div>
			<div class="design">
			<label for="manfDate">Manufactured Date</label>
				<input type="date" class="form-control" id="floatingInput" name="manfDate" required>		
			</div>
			<div class="design">
			<label for="expiryDate">Expiry Date</label>
				<input type="date" class="form-control" id="floatingInput" name="expiryDate" required>		
			</div>
			
			<div>
			<input type="submit" value="Save" class="btn btn-primary">
			</div></form>            
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>