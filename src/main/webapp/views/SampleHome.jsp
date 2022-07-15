<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="/css/home.css" />
	</head>
	<body>	
		<h1>Maveric Bank</h1>
		<p> Welcome to Maveric Bank Help Desk!! </p>
		<p><marquee><a href="DisputeForm.html">Click here to open dispute form</a></marquee></p>
		
		<form action="../addMasterCustomerDetails" method="post">

	      <!--    CustomerName :<input type="text" name="customerName"> <br> 
	        CardNumber :<input type="text" name="cardNumber"> <br> 
	        AccountNumber :<input type="text" name="accountNumber"> <br> 
	        EmailId :<input type="text" name="emailId"> <br> 
	        MobileNumber :<input type="text" name="mobileNumber"> <br> 
		    CurrentDate :<input type="date" pattern="yyyy-MM-dd"  name="presentDate"> <br> 
		    <br> 
	        transactionDate : <input type="date" pattern="yyyy-MM-dd"  name="transactionDate"> <br>
	        merchantAtmName : <input type="text" name="merchantAtmName"> <br>
	        transactionAmount :<input type="text" name="transactionAmount"> <br>
	        disputeAmount : <input type="text" name="disputeAmount"> <br>
	        transactionIntimationDetails :<input type="text" name="transactionIntimationDetails"> <br>
	        <br>

			stoleOnDate :<input type="date" pattern="yyyy-MM-dd" name="stoleOnDate"><br>
			reportOnDate :<input type="date" pattern="yyyy-MM-dd" name="reportOnDate"><br>
			noOfTransaction :<input type="text" name="noOfTransaction"><br>
			noOfTimesBilled :<input type="text" name="noOfTimesBilled"><br>
			deliveredDate :<input type="date" pattern="yyyy-MM-dd" name="deliveredDate"><br>
			authorisedAmount :<input type="text" name="authorisedAmount"><br>
			billedAmount :<input type="text" name="billedAmount"><br>
			atmBilledAmount:<input type="text" name="atmBilledAmount"><br>
			atmRecievedAmount :<input type="text" name="atmRecievedAmount"><br>
			atmDisputeAmount :<input type="text" name="atmDisputeAmount"><br>
			otherDetails :<input type="text" name="otherDetails"><br>
			flag1 :<input type="text" name="flag1"><br>
			flag2 :<input type="text" name="flag2"><br>
			flag3 :<input type="text" name="flag3"><br>
			flag4 :<input type="text" name="flag4"><br>
			flag5 :<input type="text" name="flag5"><br>
			flag6 :<input type="text" name="flag6"><br>
			flag7 :<input type="text" name="flag7"><br>
			flag8 :<input type="text" name="flag8"><br>
			flag9 :<input type="text" name="flag9"><br>
			flag10 :<input type="text" name="flag10"><br>
			flag11 :<input type="text" name="flag11"><br>
			flag12 :<input type="text" name="flag12"><br>
			flag13 :<input type="text" name="flag13"><br> -->
			
			CusName :<input type="text" name="customerName"> <br> 
	        PhoneNUmber :<input type="text" name="phoneNumber"> <br> 
	        EmailId :<input type="text" name="emailId"> <br> 
	        UserName :<input type="text" name="userName"> <br> 
		    Password :<input type="text"  name="userPassword"> <br> 
		    <br> 
        
		<input type="submit" value="Add">	
		</form>

	
	</body>
</html>