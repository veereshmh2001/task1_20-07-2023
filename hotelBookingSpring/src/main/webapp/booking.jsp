<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Xworkz</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        
      </ul>  
    </div>
  </div>
</nav>
<h1>Booking Details</h1>
<form action="book" method="post" class="container">

<label for="city">City:</label>
<select name="city">
<option placeholder="Choose...">Choose..</option>
<option>Hubli</option>
<option>Mysore</option>
<option>Bangalore</option>
<option>Yadgir</option>
<option>Mangalore</option>
<option>Raichur</option>
</select><br><br>

<div class="design">
<label for="pincode">Pin Code:</label>
<input type="number" name="pincode"   placeholder=" Enter Pin Code" />
</div><br>

<div class="design">
<label for="name">Hotel Name:</label>
<input type="text" name="name"   placeholder=" Enter Hotel name" />
</div><br>

<div class="design">
<label for="rooms">Total Rooms:</label>
<input type="number" name="rooms"   placeholder=" Enter Total Rooms" />
</div><br>

<label for="available">Rooms Available:</label>
<select name="available">
<option placeholder="Choose...">Choose..</option>
<option value="true">Yes</option>
<option value="false">No</option>
</select><br><br>

<label for="roomType">Room Type:</label>
<select name="roomType">
<option placeholder="Choose...">Choose..</option>
<option>1 Bhk</option>
<option>2 Bhk</option>
<option>3 Bhk</option>
</select><br><br>

<label for="payment">Payment:</label>
<select name="payment">
<option placeholder="Choose...">Choose..</option>
<option>Cash</option>
<option>UPI</option>
<option></option>
</select><br><br>

<input type="submit" value="Save">
</form>
</body>
</html>

