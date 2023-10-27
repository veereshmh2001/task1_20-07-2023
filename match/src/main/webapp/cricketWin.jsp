<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WorldCup</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
h1{
color:red;
}
h2{
color:green;
}
</style>
<body>
<nav class="navbar" style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ICCWC23</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" 
    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="cricket.jsp">Cricket List</a>
        </li>
        
    </div>
  </div>
</nav>
<h1>ICC World Cup23</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<h2>Tournament Name=${tournamentName}</h2>
<h2>Hosting Country=${hostingCountry}</h2>
<h2>Match Date=${matchDate}</h2>
<h2>team1=${team1}</h2>
<h2>team2=${team2}</h2>
<h2>team1CaptainName Name=${team1CaptainName}</h2>
<h2>team2CaptainName=${team2CaptainName}</h2>
<h2>Umpire Name=${umpireName}</h2>
<h2>Third Umpire Name=${thirdUmpireName}</h2>
<h2>Stadium Name=${stadiumName}</h2>
<h2>Stadium Capacity=${stadiumCapacity}</h2>
</body>
</html>
