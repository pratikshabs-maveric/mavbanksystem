<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<meta charset="ISO-8859-1">
<title>Registration and Login App</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

</head>
<body>
	<!-- create navigation bar ( header) -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#" th:href="@{/}">Registration and
					Login Module</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav ml-auto">
					<li class="nav-item" sec:authorize="isAuthenticated()"><a class="nav-link" th:href="@{/logout}">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<br>
	<br>

	<div class="container">
		<h1>Logged in !</h1>
		Hey <span sec:authentication="principal.username"> User</span>
		<p> Welcome to Maveic Bank Help Desk!! </p>
		<p><a href="/views/disputeForm.jsp">Click here to open dispute form</a></p>
	</div>
	<sec:csrfInput />  
</body>
</html>
