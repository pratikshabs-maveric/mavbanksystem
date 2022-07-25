<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
		</div>
	</nav>

<br>
<br>
	<!-- Create HTML registration form -->
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">

				<!-- success message -->
				<div th:if="${param.success}">
					<div class="alert alert-info">You've successfully registered
						to our awesome app!</div>
				</div>

				<h1>Registration</h1>

				<form th:action="@{/registration}" method="post" th:object="${user}">
					<div class="form-group">
						<label class="control-label" for="customerName"> Name </label>
						<input id="customerName" class="form-control" th:field="*{customerName}"
							required autofocus="autofocus" />
					</div>

					
					<div class="form-group">
						<label class="control-label" for="phoneNumber"> Phone Number </label> <input
							id="phoneNumber" class="form-control" th:field="*{phoneNumber}" required
							autofocus="autofocus" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="email"> Email </label> <input
							id="email" class="form-control" th:field="*{emailId}" required
							autofocus="autofocus" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="userName"> UserName </label> <input
							id="userName" class="form-control" th:field="*{userName}" required
							autofocus="autofocus" />
					</div>

					<div class="form-group">
						<label class="control-label" for="userPassword"> Password </label> <input
							id="userPassword" class="form-control" type="password"
							th:field="*{userPassword}" required autofocus="autofocus" />
					</div>

					<div class="form-group">
						<button type="submit" class="btn btn-success">Register</button>
						<span>Already registered? <a href="/" th:href="@{/login}">Login
								here</a></span>
					</div>
				</form>
			</div>
		</div>
	</div>
	<sec:csrfInput />  
</body>
</html>