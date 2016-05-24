<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login | E-Shopper</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
<jsp:include page="header.jsp"/>

	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						<sf:form modelAttribute="command" action="checklogin">
	   <fieldset>
		 <p><label for="email">Email:</label></p>	
		 <p><sf:input path="email" /></p><sf:errors path="email"/>
		
		 <p><label for="password">Password:</label></p>
		 	<p><sf:password path="password" /></p><sf:errors path="password"/>
		<br/><br/>
		 <p><input type="submit" class="btn btn-default" value="Sign In"/></p>
		 </fieldset>
	</sf:form>
			<!-- 	<sf:form modelAttribute="command" action="login">
							<sf:input path="email" placeholder="Email Address" />
							<sf:input path="password" placeholder="Password" />
							<span>
								<input type="checkbox" class="checkbox"> 
								Keep me signed in
							</span>
							<button type="submit" class="btn btn-default">Login</button>
						</sf:form>	 -->
					</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User Signup!</h2>
						<sf:form modelAttribute="command" action="addCustomer">
							<input type="text" name="name" placeholder="Name"/>
							<input type="email" name="email" placeholder="Email Address"/>
							<input type="text" name="password" placeholder="Password"/>
							<input type="text" name="mobile" placeholder="Mobile Number"/>
							<input type="text" name="address" placeholder="Address"/>
							
							<button type="submit" class="btn btn-default">Signup</button>
						</sf:form>
						
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
	
	
	 <jsp:include page="footer.jsp"/>	
	
  
    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>