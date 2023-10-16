<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cricket Team</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
.point{
color:green;
font-weight:bold;
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
        
    </div>
  </div>
</nav>
<form action="win" method="post" class="container" name="myForm"
		onsubmit="return validateForm()">
		<h1>
			<span style="color: red;">${errorMsg }</span><br>
		</h1>
		<h1>Match details</h1>
		</br>
		<div class="design">
			<label class="point" for="tournamentName">Tournament Name </label><span id="tournamentNameError"  style='color:red;' ></span><br> <input type="text"
				name="tournamentName" class="form-control" id="tournamentName"
				placeholder=" Enter Tournament name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="hostingCountry">Hosting Country</label><span id="hostingCountryError"  style='color:red;' ></span> <select
				id="hostingCountry" class="form-select" name="hostingCountry">
				<option selected>Choose...</option>
				<option>India</option>
				<option>Australia</option>
				<option>England</option>
				<option>Pakistan</option>
			</select>
		</div>
		</br>
		<label class="point" for="matchDate" class="data">Match Date</label><span id="matchDateError"  style='color:red;' ></span>
	<input type="date" id="matchDate" name="matchDate">
	<br><br>
		<div class="design">
			<label class="point" for="team1">Team 1</label><span id="team1Error"  style='color:red;' ></span> <select
				id="team1" class="form-select" name="team1">
				<option selected>Choose...</option>
				<option>India</option>
				<option>Australia</option>
				<option>England</option>
				<option>SriLanka</option>
			</select>
		</div>
		</br>
		<div class="design">
			<label class="point" for="team2">Team 2</label><span id="team2Error"  style='color:red;' ></span> <select
				id="team2" class="form-select" name="team2">
				<option selected>Choose...</option>
				<option>SouthAfrica</option>
				<option>Bangladesh</option>
				<option>NewZeland</option>
				<option>Pakistan</option>
			</select>
		</div>
		</br>
		<div class="design">
			<label class="point" for="team1CaptainName">Team 1 Captain Name </label><br><span id="team1CaptainNameError"  style='color:red;' ></span> <input type="text"
				name="team1CaptainName" class="form-control" id="team1CaptainName"
				placeholder=" Enter name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="team2CaptainName">Team 2 Captain Name </label><br><span id="team2CaptainNameError"  style='color:red;' ></span> <input type="text"
				name="team2CaptainName" class="form-control" id="team2CaptainName"
				placeholder=" Enter name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="umpireName">Umpire Name </label><br><span id="umpireNameError"  style='color:red;' ></span> <input type="text"
				name="umpireName" class="form-control" id="umpireName"
				placeholder=" Enter name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="thirdUmpireName">Third Umpire Name </label><br><span id="thirdUmpireNameError"  style='color:red;' ></span> <input type="text"
				name="thirdUmpireName" class="form-control" id="thirdUmpireName"
				placeholder=" Enter name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="stadiumName">Stadium Name </label><br><span id="stadiumNameError"  style='color:red;' ></span> <input type="text"
				name="stadiumName" class="form-control" id="stadiumName"
				placeholder=" Enter Stadium name">
		</div>
		</br>
		<div class="design">
			<label class="point" for="stadiumCapacity">Stadium Capacity </label><br><span id="stadiumCapacityError"  style='color:red;' ></span> <input type="number"
				name="stadiumCapacity" class="form-control" id="stadiumCapacity">
			</div>	
		</br>
		<input type="submit" value="Save" class="btn btn-primary">
		
		</form>
<script >
function validateForm() {
	
	var tournamentName = document.getElementById('tournamentName').value;
	var hostingCountry = document.getElementById('hostingCountry').value;
	var team1= document.getElementById('team1').value;
	var team2= document.getElementById('team2').value;
	var team1CaptainName = document.getElementById('team1CaptainName').value;
	var team2CaptainName = document.getElementById('team2CaptainName').value;
	var umpireName = document.getElementById('umpireName').value;
	var thirdUmpireName = document.getElementById('thirdUmpireName').value;
	var stadiumName = document.getElementById('stadiumName').value;
	var stadiumCapacity = parseInt(document.getElementById('stadiumCapacity').value);
	var submitButton = document.querySelector('button[type="submit"]');
	
	if (tournamentName.length < 3 || tournamentName.length > 40) {
		alert('Tournament Name must be between 3 and 20 characters.');
		document.getElementById('tournamentNameError').innerHTML='Tournament Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('tournamentNameError').innerHTML='';
	}
	
	if (hostingCountry === 'Choose...') {
		alert('Please select a Hosting Country.');
		return false;
		}
	
	if (team1 === 'Choose....') {
		alert('Please select a team1.');
		return false;
		}
	
	if (team2 === 'Choose...') {
		alert('Please select a team2.');
		return false;
		}
	
	if (team1CaptainName.length < 3 || team1CaptainName.length > 40) {
		alert('Team1 Captain Name must be between 3 and 40 characters.');
		document.getElementById('team1CaptainNameError').innerHTML='Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('team1CaptainNameError').innerHTML='';
	}
	
	if (team2CaptainName.length < 3 || team2CaptainName.length > 40) {
		alert('Team2 Captain Name must be between 3 and 40 characters.');
		document.getElementById('team2CaptainNameError').innerHTML='Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('team2CaptainNameError').innerHTML='';
	}
	
	if (umpireName.length < 3 || umpireName.length > 40) {
		alert('Umpire Name must be between 3 and 40 characters.');
		document.getElementById('umpireNameError').innerHTML='Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('umpireNameError').innerHTML='';
	}
	
	if (thirdUmpireName.length < 3 || thirdUmpireName.length > 40) {
		alert('Third Umpire Name must be between 3 and 40 characters.');
		document.getElementById('thirdUmpireNameError').innerHTML='Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('thirdUmpireNameError').innerHTML='';
	}
	
	if (stadiumName.length < 3 || stadiumName.length > 40) {
		alert('Stadium Name must be between 3 and 40 characters.');
		document.getElementById('stadiumNameError').innerHTML='Name must be between 3 and 40';
		return false;
		}
	else{
		document.getElementById('stadiumNameError').innerHTML='';
	}
	
	if (stadiumCapacity <= 1 || stadiumCapacity >= 200000) {
		alert('Stadium Capacity must be greater than 0 and less than 200000.');
		return false;
		}
	
	submitButton.removeAttribute('disabled');
	return true;
	
}
</script>
</body>
</html>
