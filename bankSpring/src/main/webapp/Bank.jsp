<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Bank Details</title>
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

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluid">
<a class="navbar-brand" href="#">Details</a>
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
<span style="color: red;">
<c:forEach var = "objectErrors" items="${errors}">
        ${objectErrors.defaultMessage}</br>
      </c:forEach>
</span>
<span>${dto}</span>
<form action="created" method="post">
  <div class="row">
    <div class="col">
      <label for="first-name">First Name</label>
      <input type="text" class="form-control" name="fname" id="fname" placeholder="First Name" value="${dto.fname}">
    </div>
    
    <div class="row">
    <div class="col">
      <label for="middle-name">Middle Name</label>
      <input type="text" class="form-control" name="mname" id="mname" placeholder="Middle Name" value="${dto.mname}">
    </div>
    
    <div class="row">
    <div class="col">
      <label for="last-name">Last Name</label>
      <input type="text" class="form-control" name="lname" id="lname" placeholder="Last Name" value="${dto.lname}">
    </div>
   
  <div class="form-group">
    <label for="mobile">Mobile Number</label>
    <input type="number" name="mobile" class="form-control" id="mobile" placeholder="Mobile Number" value="${dto.mobile}">
  </div><br>
  
  <div class="form-group">
    <label for="aadhar">Aadhar Number</label>
    <input type="number" name="aadhar" class="form-control" id="aadhar" placeholder="Aadhar Number" value="${dto.aadhar}">
  </div><br>
  
  <div class="form-group">
    <label for="email">E-Mail</label>
    <input type="email" name="email" class="form-control" id="email" placeholder="E-mail" value="${dto.email}">
  </div><br>
  
  <div class="form-group">
    <label for="dob">Date Of Birth</label>
    <input type="date" name="dob" class="form-control" id="dob" placeholder="Date Of Birth" value="${dto.dob}">
  </div><br>
  
  <div class="container-lg">
  <label for="address">Address</label>
  <input name="address" class="form-control" id="address" placeholder="Address" value="${dto.address}">
  </div>
  
  <div class="form-group">
    <label for="state">State</label>
    <select class="form-control" id="state" name="state">
    <option selected value=" ">Choose</option>
       <option  <c:if test="${dto.state=='Karnataka'}">selected="selected"</c:if>>Karnataka</option>
      <option  <c:if test="${dto.state=='Goa'}">selected="selected"</c:if>>Goa</option>
       <option <c:if test="${dto.state=='Kerala'}">selected="selected"</c:if>>Kerala</option>
      <option <c:if test="${dto.state=='Jammu'}">selected="selected"</c:if>>Jammu</option>
        <option  <c:if test="${dto.state=='TamilNadu'}">selected="selected"</c:if>>Tamil Nadu</option>
           </select>
  </div>
  
 <label for="gender">Gender:</label>
<input type="radio" id="painted-checkbox" name="gender" value="true"> Male 
<input type="radio" id="not-painted-checkbox" name="gender" value="false"> Female
<br><br>
  
  
  
  
  <button type="submit" value="save" class="btn btn-primary">Submit</button>
</form>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>