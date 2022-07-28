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
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js"></script>
	<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.min.css'></link>  
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

				<!-- success message 
				<div th:if="${param.success}">
					  <div class="alert alert-info">You've successfully registered 
						to our bank!</div> 
						<!--  swal("You've successfully registered to our bank!"); 
				</div>
				<!-- Failure message 
				<div th:if="${param.failure}">
					<div class="alert alert-danger">User already exists !</div>
				</div>
				
				<div th:if="${param.failed}">
					<div class="alert alert-danger">Unable to register! Kindly contact the administrator.</div>
				</div> -->
				
				<h1>Registration</h1>

				<form name="registration" th:action="@{/registration}" method="post" th:object="${user}" onSubmit="return validateregform()">
					<div class="form-group">
						<label class="control-label" for="customerName"> Name </label>
						<input id="customerName" class="form-control" th:field="*{customerName}"
							required autofocus="autofocus" oninvalid="this.setCustomValidity('Kindly enter Customer Name!')"
  oninput="this.setCustomValidity('')"/>
					</div>

					
					<div class="form-group">
						<label class="control-label" for="phoneNumber"> Phone Number </label> <input
							id="phoneNumber" class="form-control" th:field="*{phoneNumber}" required pattern="[1-9]{1}[0-9]{9}"
							autofocus="autofocus" oninvalid="this.setCustomValidity('Kindly enter 10 digit Phone Number')"
  oninput="this.setCustomValidity('')" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="email"> Email </label> <input
							id="email" class="form-control" th:field="*{emailId}" required pattern="(?![_.-])((?![_.-][_.-])[a-zA-Z\d_.-]){0,63}[a-zA-Z\d]@((?!-)((?!--)[a-zA-Z\d-]){0,63}[a-zA-Z\d]\.){1,2}([a-zA-Z]{2,14}\.)?[a-zA-Z]{2,14}"
							autofocus="autofocus" oninvalid="this.setCustomValidity('Kindly enter valid Email Id!')"
  oninput="this.setCustomValidity('')" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="userName"> UserName </label> <input
							id="userName" class="form-control" th:field="*{userName}" required
							autofocus="autofocus" oninvalid="this.setCustomValidity('Kindly enter User Name!')"
  oninput="this.setCustomValidity('')" />
					</div>

					<div class="form-group">
						<label class="control-label" for="userPassword"> Password </label> <input
							id="userPassword" class="form-control" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Password must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
							th:field="*{userPassword}" required autofocus="autofocus" oninvalid="this.setCustomValidity('Kindly enter Password!')"
  oninput="this.setCustomValidity('')" />
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
<script>
		const queryString = window.location.search;
		console.log(queryString);
		if(queryString.trim()=='?success')
			{
				swal({
					  text: "You've successfully registered to our bank!",
					  icon: "success",
					  buttons: false,
					  timer: 3000
					});
			}
		else if(queryString.trim()=='?failure')
		{
			swal({
				  text: "User already exists !",
				  icon: "error",
				  buttons: false,
				  timer: 3000
				});
		}
		else if(queryString.trim()=='?failed')
		{
			swal("Unable to register! Kindly contact the administrator.");
		}
</script>
</html>