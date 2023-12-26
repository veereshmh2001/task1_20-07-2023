<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Cake Order Details</title>
 <style>
    body {
      padding-top: 60px;
    }

    form {
      max-width: 600px;
      margin: auto;
      padding: 20px;
      border: 1px solid #ddd;
      border-radius: 10px;
      margin-top: 20px;
    }

    label {
      margin-top: 10px;
    }

    select,
    input[type="text"],
    input[type="email"] {
      margin-bottom: 15px;
    }

    button {
      margin-top: 15px;
    }
  </style>
 
</head>

<body>
<span style="color: red;">
<c:forEach var = "objr" items="${errors}">
        ${objr.defaultMessage}</br>
      </c:forEach>
</span>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluid">
<a class="navbar-brand" href="#">Order</a>
<button class="navbar-toggler" type="button"
data-bs-toggle="collapse" data-bs-target="#navbarNav"
aria-controls="navbarNav" aria-expanded="false"
aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarNav">
<ul class="navbar-nav">
<li class="nav-item"><a class="nav-link active"
aria-current="page" href="index.jsp">Home</a></li>
</li>
</ul>
</div>
</div>
</nav>

<body>
<h1 style='color:green;'>${msg}</h1>
<form action="choco" method="post">
  <div class="row">
    <div class="col">
      <label for="first-name">Customer</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Name" value="${dto.name}">
    </div>

  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" name="email" class="form-control" id="email" placeholder="Your email" value="${dto.email}">
  </div>
 
  
   
<div class="form-group">
    <label for="flavour">Flavour</label>
    <select class="form-control" id="flavour" name="flavour">
    <option value="choose">Choose</option>
      <option >Chocolate</option>
      <option >Pineapple</option>
       <option >Straberry</option>
      <option >ButterScotch</option>
       
 
    </select>
  </div>

 <div class="form-group">
    <label for="weight">Weight</label>
    <select class="form-control" id="weight" name="weight">
    <option >Choose</option>
      <option >500g</option>
      <option >1kg</option>
      <option >2kg</option>
      <option >3kg</option>
      
    </select>
  </div>




  <div class="form-group">
    <label for="price">Price</label>
    <input type="number" name="price" class="form-control" id="price" placeholder="price" value="${dto.price}">
  </div><br>
  <label for="takeAway">Take Away:</label>
<input type="radio" id="painted-checkbox" name="takeAway" value="true"> Yes 
<input type="radio" id="not-painted-checkbox" name="member" value="false"> No
<br>
  <button type="submit" value="save" class="btn btn-primary">Order</button>
</form>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>