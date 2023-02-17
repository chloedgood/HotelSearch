<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1 > Hotels in ${city}</h1>
	<c:forEach var="hotel" items="${hotels}">
 <div>
	 <h2 > Hotel :  ${hotel.hotelName}</h2>
	 <h3> Price per night : $   ${hotel.pricePerNight} </h3>
</div>
	
	</c:forEach>
<br> <br>


<a href="/"> Start a New Search </a>
</body>
</html>