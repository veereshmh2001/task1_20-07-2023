<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Scientist Details</title>
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
<h1 style='color:green;'>${msg}</h1>
<span style="color: red;">
<c:forEach var = "objectErrors" items="${errors}">
        ${objectErrors.defaultMessage}</br>
      </c:forEach>
</span>
<span>${dto}</span>
<form action="award" method="post">
  <div class="row">
    <div class="col">
      <label for="first-name">Scientist Name</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Name" value="${dto.name}">
    </div>
   
<div class="form-group">
    <label for="field">Field</label>
    <select class="form-control" id="field" name="field">
    <option selected value=" ">selected</option>
       <option value="ecologist" <c:if test="${dto.field=='ecologist'}">selected="selected"</c:if>>Ecologist</option>
      <option value="geneticist" <c:if test="${dto.field=='geneticist'}">selected="selected"</c:if>>Geneticist</option>
       <option value="neuroscientist" <c:if test="${dto.field=='neuroscientist'}">selected="selected"</c:if>>Neuroscientist</option>
      <option value="oceanographer"<c:if test="${dto.field=='oceanographer'}">selected="selected"</c:if>>Oceanographer</option>
        <option value="epidemiologist" <c:if test="${dto.field=='epidemiologist'}">selected="selected"</c:if>>Epidemiologist</option>
           </select>
  </div>

  <div class="form-group">
    <label for="experience">Experience</label>
    <input type="number" name="experience" class="form-control" id="experience" placeholder="Experience" value="${dto.experience}">
  </div><br>
  
  <div class="form-group">
    <label for="country">Country</label>
    <select class="form-control" id="country" name="country">
    <option selected value=" ">Choose</option>
       <option value="india" <c:if test="${dto.country=='india'}">selected="selected"</c:if>>India</option>
      <option value="japan" <c:if test="${dto.country=='japan'}">selected="selected"</c:if>>Japan</option>
       <option value="russia" <c:if test="${dto.country=='russia'}">selected="selected"</c:if>>Russia</option>
      <option value="china"<c:if test="${dto.country=='china'}">selected="selected"</c:if>>China</option>
        <option value="pak" <c:if test="${dto.country=='pak'}">selected="selected"</c:if>>Pak</option>
           </select>
  </div>
  
  <div class="row">
    <div class="col">
      <label for="first-name">Achievment</label>
      <input type="text" class="form-control" name="achievment" id="achievment" placeholder="Achievment" value="${dto.achievment}">
    </div>
  
  
  <button type="submit" value="save" class="btn btn-primary">Submit</button>
</form>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>