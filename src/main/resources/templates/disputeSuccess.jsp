<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
	<meta charset="ISO-8859-1">	
		<title>Home</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="/css/home.css" />
	</head>
	<body>	
		<h1>Maveric Bank</h1>
		<br>
		<br>
		<p>Dispute form has been submitted successfully!</p>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<p><a href="#" th:href="@{/}">Go to Home</a></p>
	</body>
	<div class="footer">
    <img src="/images/footer-logo.svg" class="footer-img" />
    &copy; Copyright 2022 Maveric Systems Limited
	</div>  
</html>