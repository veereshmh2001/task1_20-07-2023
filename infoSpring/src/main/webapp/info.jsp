<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>INFO</title>
</head>
<h1>Details</h1>
<body>
<form action="info" method="post" class="container">

<div class="design">
<label for="name">Name:</label>
<input type="text" name="name"   placeholder=" Enter name" />
</div><br>

<div class="design">
<label for="email">Email:</label>
<input type="email" name="email"   placeholder=" Enter email" />
</div><br>

<label for="age">Age</label>
<select name="age">
<option>Select</option>
<c:forEach items="${number}" var="num">
<option>${num}</option>
</c:forEach>
</select>

<label for="district">District:</label>
<select name="district">
<option placeholder="Choose...">Choose..</option>
<option>Haveri</option>
<option>Raichur</option>
<option>Udupi</option>
<option>Hassan</option>
<option>Mandya</option>
<option>Belagavi</option>
</select><br><br>

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

<label for="state">State:</label>
<select name="state">
<option placeholder="Choose...">Choose..</option>
<option>Karnataka</option>
<option>Tamil Nadu</option>
<option>Kerala</option>
<option>Goa</option>
<option>Maharastra</option>
<option>Gujarat</option>
</select><br><br>

<label for="country">Country:</label>
<select name="country">
<option placeholder="Choose...">Choose..</option>
<option>India</option>
<option>Sri Lanka</option>
<option>USA</option>
<option>Russia</option>
<option>Canada</option>
<option>Pakistan</option>
</select><br><br>

<div class="design">
<label for="pincode">Pin Code:</label>
<input type="number" name="number"   placeholder=" Enter Pin Code" />
</div><br>
<input type="submit" value="Save">
</form>
</body>
</html>