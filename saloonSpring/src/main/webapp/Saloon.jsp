<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saloon</title>
</head>
<h1>Appointment</h1>
<body>

<form action="saloon" method="post" class="container">
<div class="design">
<label for="name">Name:</label>
<input type="text" name="name"   placeholder=" Enter name" />
</div><br>

<div class="design">
<label for="date">Date:</label>
<input type="date" name="date"   placeholder=" Enter date" />
</div><br>

<label for="Time">Time:</label>
<select name="Time">
<option selected value="Choose...">Choose..</option>
<option value="Morning">Morning</option>
<option value="noon">AfterNoon</option>
<option value="eve">Evening</option>
</select><br><br>

<div class="design">
<label for="email">Email:</label>
<input type="email" name="email"   placeholder=" Enter email" />
</div><br>

<div class="design">
<label for="number">Mobile Number:</label>
<input type="number" name="number"   placeholder=" Enter Mobile Number" />
</div><br>

<label for="Location">Location:</label>
<select name="Location" >
<option placeholder="Choose...">Choose..</option>
<option>Rajajinagar</option>
<option>Magadi</option>
<option>Yellapur</option>
<option>Mahalaxmi</option>
<option>Nandini Layout</option>
</select><br><br>

<label for="Purpose">Purpose:</label>
<select name="Purpose">
<option placeholder="Choose...">Choose..</option>
<option>Hair Cut</option>
<option>Shaving</option>
<option>Facial</option>
<option>Hair wash</option>
<option>Head Massage</option>
</select><br><br>

<label for="gender">Gender:</label>
<input type="radio" id="painted-checkbox" name="gender" value="true"> Male 
<input type="radio" id="not-painted-checkbox" name="gender" value="false"> Female
<br><br>

<label for="member">Member:</label>
<input type="radio" id="painted-checkbox" name="member" value="true"> Yes 
<input type="radio" id="not-painted-checkbox" name="member" value="false" checked> No
<br><br>

<label for="age">Age</label>
<select>
<option>Select</option>
<c:forEach items="${number}" var="num">
<option>${num}</option>
</c:forEach>
</select>

<label for="payment">Payment:</label>
<select name="payment">
<option placeholder="Choose...">Choose..</option>
<option>Cash</option>
<option>Debit</option>
<option>Credit</option>
<option>UPI</option>
<option>Free</option>
<option>Loan</option>
</select><br><br>

<input type="submit" value="Save">
</form>
</body>
</html>