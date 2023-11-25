<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<nav class="navbar" style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Information</a>
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

<form action="student" method="post" class="container" name="myForm"
		onsubmit="return validateForm()">
		<h1>Details</h1>
		<div class="design">
			<label for="fName"> First Name </label><br> <span
				id="fNameError" style='color: red;'></span> <input
				onblur="fNameValidaiton()" type="text"
				name="fName" class="form-control" id="fName"
				placeholder=" Enter first name">
		</div>
		<br>
		<div class="design">
			<label for="lName"> Last Name </label><br> <span
				id="lNameError" style='color: red;'></span> <input
				onblur="lNameValidaiton()" type="text"
				name="lName" class="form-control" id="lName"
				placeholder=" Enter last name">
		</div>
		<br>
		
		<div class="design">
			<label for="mName"> Middle Name </label><br> <span
				id="mNameError" style='color: red;'></span> <input
				onblur="mNameValidaiton()" type="text"
				name="mName" class="form-control" id="mName"
				placeholder=" Enter middle name">
		</div>
		<br>
		<div class="design">
			<label for="email"> Email </label><br> <span
				id="emailError" style='color: red;'></span> <input
				onblur="emailValidaiton()" type="email"
				name="email" class="form-control" id="email"
				placeholder=" Enter email">
		</div>
		<br>
		<div class="design">
			<label for="gender">Gender </label><br> <span
				id="genderError" style='color: red;'></span> <input
				onblur="genderValidaiton()" type="text"
				name="gender" class="form-control" id="gender"
				placeholder=" Gender">
		</div>
		<br>
		<div class="design">
			<label for="mobileNumber">Mobile Number </label><br> <span
				id="mobileNumberError" style='color: red;'></span> <input
				onblur="mobileNumberValidaiton()" type="number"
				name="mobileNumber" class="form-control" id="mobileNumber"
				placeholder=" Mobile Number">
		</div>
		<br>
		<div class="design">
			<label for="area">Area </label><br> <span
				id="areaError" style='color: red;'></span> <input
				onblur="areaValidaiton()" type="text"
				name="area" class="form-control" id="area"
				placeholder=" area">
		</div>
		<br>
		<div class="design">
			<label for="district">District </label><br> <span
				id="districtError" style='color: red;'></span> <input
				onblur="districtValidaiton()" type="text"
				name="district" class="form-control" id="district"
				placeholder=" district">
		</div>
		<br>
		<div class="design">
			<label for="state">State </label><br> <span
				id="stateError" style='color: red;'></span> <input
				onblur="stateValidaiton()" type="text"
				name="state" class="form-control" id="state"
				placeholder=" state">
		</div>
		<br>
		<div class="design">
			<label for="pincode">Pincode </label><br> <span
				id="pincodeError" style='color: red;'></span> <input
				onblur="pincodeValidaiton()" type="number"
				name="pincode" class="form-control" id="pincode"
				placeholder="pincode">
		</div>
		
		
		
		<div class="button">
			<button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
		</div>
		
</form>
<script>
function fNameValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var fName = document.getElementById('fName').value;
	console.log(fName)
	if (fName.length < 3 || fName.length > 20) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('fNameError').innerHTML='Name must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('fNameError').innerHTML='';

}

}
function lNameValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var lName = document.getElementById('lName').value;
	console.log(lName)
	if (lName.length < 3 || lName.length > 20) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('lNameError').innerHTML='Name must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('lNameError').innerHTML='';

}

}

function mNameValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var mName = document.getElementById('mName').value;
	console.log(mName)
	if (mName.length < 3 || mName.length > 20) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('mNameError').innerHTML='Name must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('mNameError').innerHTML='';

}

}

function mobileNumberValidation(){
    var submitButton = document.getElementById("submitButton");
    var mobileNumber = document.getElementById('mobileNumber').value;
    console.log(mobileNumber);
    if (mobileNumber<1000000000 || mobileNumber>9999999999) {
    document.getElementById("mobileNumberError").innerHTML = "Please enter the mobileNumber here.."
    return false;
    }
    else{
    document.getElementById("mobileNumberError").innerHTML ="";
    }
    }
    
function genderValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var gender = document.getElementById('gender').value;
	console.log(gender)
	if (gender.length < 1 || gender.length > 7) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('genderError').innerHTML='Gender must be between 1 and 7 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('genderError').innerHTML='';

}

}

function areaValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var area = document.getElementById('area').value;
	console.log(area)
	if (area.length < 1 || area.length > 7) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('areaError').innerHTML='Area Name must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('areaError').innerHTML='';

}

}

function districtValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var district = document.getElementById('district').value;
	console.log(district)
	if (district.length < 1 || district.length > 7) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('districtError').innerHTML='District Name must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('districtError').innerHTML='';

}

}

function stateValidaiton()
{
	var submitButton = document.getElementById("submitButton");

	var state = document.getElementById('state').value;
	console.log(state)
	if (state.length < 1 || state.length > 7) {
	//alert('Name must be between 3 and 20 characters.');
	document.getElementById('stateError').innerHTML='State must be between 3 and 20 characters';
	submitButton.setAttribute("disabled" ,"")

}
else{
	submitButton.removeAttribute("disabled")

	document.getElementById('stateError').innerHTML='';

}

}
function pincodeValidation(){
    var submitButton = document.getElementById("submitButton");
    var pincode = document.getElementById('pincode').value;
    console.log(pincode);
    if (pincode<1000000000 || pincode>9999999999) {
    document.getElementById("pincodeError").innerHTML = "Please enter the pincode here.."
    return false;
    }
    else{
    document.getElementById("pincodeError").innerHTML ="";
    }
    }

function validateForm() {
	var fName = document.getElementById('fName').value;
	var lName = document.getElementById('lName').value;
	var mName = document.getElementById('mName').value;
	var mobileNumber = document.getElementById('mobileNumber').value;
	var gender = document.getElementById('gender').value;
	var area = document.getElementById('area').value;
	var district = document.getElementById('district').value;
	var state = document.getElementById('state').value;
	var pincode = document.getElementById('pincode').value;
	
	
	if (fName.length < 3 || fName.length > 20) {
		//alert('Name must be between 3 and 20 characters.');
		document.getElementById('fNameError').innerHTML='Name must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('fNameError').innerHTML='';
	}
	
	if (lName.length < 3 || lName.length > 20) {
		//alert('Name must be between 3 and 20 characters.');
		document.getElementById('lNameError').innerHTML='Name must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('lNameError').innerHTML='';
	}
	
	if (mName.length < 3 || mName.length > 20) {
		//alert('Name must be between 3 and 20 characters.');
		document.getElementById('mNameError').innerHTML='Name must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('mNameError').innerHTML='';
	}
	
	if (gender.length < 1 || gender.length > 7) {
		//alert('Name must be between 1 and 7 characters.');
		document.getElementById('genderError').innerHTML='Gender must be between 1 and 7 characters';
		return false;
		}
		else{
			document.getElementById('genderError').innerHTML='';
	}
	
	if (area.length < 3 || area.length > 20) {
		//alert('Name must be between 3 and 20 characters.');
		document.getElementById('areaError').innerHTML='Area must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('areaError').innerHTML='';
	}
	
	if (district.length < 3 || district.length > 20) {
		//alert('district must be between 3 and 20 characters.');
		document.getElementById('districtError').innerHTML='Area must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('districtError').innerHTML='';
	}
	
	if (state.length < 3 || state.length > 20) {
		//alert('state must be between 3 and 20 characters.');
		document.getElementById('stateError').innerHTML='State must be between 3 and 20 characters';
		return false;
		}
		else{
			document.getElementById('stateError').innerHTML='';
	}
	submitButton.removeAttribute('submitButton');
	return true;
}

</script>
</body>
</html>