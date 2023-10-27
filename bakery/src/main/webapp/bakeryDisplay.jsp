<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<style>
h1{
color:green;
font-weight:bold;
}
h2{
font-weight:bold;
color:red;
}
h1{
text-align:center;
}
ul li{
color:black;
font-weight:bold;
}
</style>
<body>
<h1>Bakery Application details sent successfully..</h1>
<ul>
	<li> Name:${name}</li> 
	<br><li>Item Price:${price}</li>
	<br><li>Quantity:${ quantity} </li>	
	<br><li>Discount:${discount}</li> 
	<br><li>Gst:${gst}  </li>
	<br><li>Manufacture Date:${manfDate}</li> 
	<br><li>Expiry Date:${expiryDate}</li> 
	</ul>
	<br><h2>Total:${total}</h2><br>
	<br>
	<h2 style='color:maroon;' >Current Date AND Time: <%= new java.util.Date() %></h2>
	</h2>
	<h1  style='color:blue;'>Thank you</h1>
</body>
</html>