<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Donation</title>
</head>
<body>
<form action="blood" method="post">

<div class="design">
<label for="name">Name:</label>
<input type="text" name="name"   placeholder=" Enter name" />
</div><br>

<div class="design">
<label for="age">Age:</label>
<input type="number" name="age"   placeholder=" Enter age" />
</div><br>

<div class="design">
<label for="group">Blood Group:</label>
<input type="text" name="group"   placeholder=" Enter Blood Group" />
</div><br>

<div class="design">
<label for="weight">Weight:</label>
<input type="number" name="weight"   placeholder=" Enter Weight" />
</div><br>

<label for="gender">Gender:</label>
<select name="gender">
<option placeholder="Choose...">Choose..</option>
<option value="M">Male</option>
<option value="F">Female</option>

</select><br><br>

<label for="sickness">Any Sickness:</label>
<select name="sickness">
<option placeholder="Choose...">Choose..</option>
<option value="true">Yes</option>
<option value="false">No</option>

</select><br><br>

<label for="alchol">Alchol:</label>
<select name="alchol">
<option placeholder="Choose...">Choose..</option>
<option value="true">Yes</option>
<option value="false">No</option>

</select><br><br>

<input type="submit" value="Save">
</form>
</body>
</html>