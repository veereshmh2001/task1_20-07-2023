<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Singer Details</title>
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
<form action="award" method="post">
  <div class="row">
    <div class="col">
      <label for="song-name">Song Name</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Song Name" value="${dto.name}">
    </div>
    
    <div class="col">
      <label for="singer-name">Singer Name</label>
      <input type="text" class="form-control" name="sname" id="sname" placeholder="Singer Name" value="${dto.sname}">
    </div>
    
    <div class="col">
      <label for="composer">Composer</label>
      <input type="text" class="form-control" name="composer" id="composer" placeholder="Composer" value="${dto.composer}">
    </div>
  
   
<div class="form-group">
    <label for="language">Language</label>
    <select class="form-control" id="language" name="language">
    <option selected value=" ">selected</option>
       <option value="kannada" <c:if test="${dto.language=='kannada'}">selected="selected"</c:if>>Kannada</option>
      <option value="telugu" <c:if test="${dto.language=='telugu'}">selected="selected"</c:if>>Telugu</option>
       <option value="tamil" <c:if test="${dto.language=='tamil'}">selected="selected"</c:if>>Tamil</option>
      <option value="hindi"<c:if test="${dto.language=='hindi'}">selected="selected"</c:if>>Hindi</option>
        <option value="english" <c:if test="${dto.language=='english'}">selected="selected"</c:if>>English</option>
           </select>
  </div>
  
  <div class="form-group">
    <label for="album">Album</label>
    <select class="form-control" id="album" name="album">
    <option selected value=" ">selected</option>
       <option value="live" <c:if test="${dto.album=='live'}">selected="selected"</c:if>>Live</option>
      <option value="remix" <c:if test="${dto.album=='remix'}">selected="selected"</c:if>>Remix</option>
       <option value="tribute" <c:if test="${dto.album=='tribute'}">selected="selected"</c:if>>Tribute</option>
      <option value="acoustic"<c:if test="${dto.album=='acoustic'}">selected="selected"</c:if>>acoustic</option>
        <option value="soundtrack" <c:if test="${dto.album=='soundtrack'}">selected="selected"</c:if>>Sound Track</option>
           </select>
  </div><br>
  
  

  
 
  
  <div class="form-group">
    <label for="release">Release Date</label>
    <input type="date" name="release" class="form-control" id="release" placeholder="Release Date" value="${dto.release}">
  </div><br>
  
  <div class="col">
      <label for="lyricist">Lyricist</label>
      <input type="text" class="form-control" name="lyricist" id="lyricist" placeholder="Lyricist" value="${dto.lyricist}">
    </div>
    
     <div class="col">
      <label for="producer">Producer</label>
      <input type="text" class="form-control" name="producer" id="producer" placeholder="Producer" value="${dto.producer}">
    </div>
    
    <div class="col">
      <label for="director">Director</label>
      <input type="text" class="form-control" name="director" id="director" placeholder="Director" value="${dto.director}">
    </div>
  
   
  
  
  <button type="submit" value="save" class="btn btn-primary">Submit</button>
</form>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>