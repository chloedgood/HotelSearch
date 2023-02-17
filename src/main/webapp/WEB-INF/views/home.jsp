
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h1> Hotel Search </h1>
	<form action="/results" method="post">
	
		<label for="city"> City:</label> <br>
		
		<select id = "city" name="city">
		
		<option value="Columbus"> Columbus </option>
		<option value="New York"> New York </option>
		<option value="Boston"> Boston </option>
		<option value="Seattle"> Seattle </option>
		
		
		</select>
	
	<br> 
	<input type= "submit" value="Go">	
	
	</form>
</body>
</html>