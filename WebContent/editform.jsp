<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Admin | E-Shopper</title>
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
				<div class="col-sm-5">
					<div class="signup-form"><!--submit form-->
						<h2>New Product Details!</h2>
						
						 <form method="post" action="edit">
					    	<div>
						    	<span><label>Product Id</label></span>
						    	<span><input name="product_id" type="text" class="textbox" value="${product.product_id}"></span>
						    </div>
					    	<div>
						    	<span><label>Product Name</label></span>
						    	<span><input name="product_name" type="text" class="textbox" value="${product.product_name}"></span>
						    </div>
						    <div>
						    	<span><label>Product Brand</label></span>
						    	<span><input name="product_brand" type="text" class="textbox" value="${product.product_brand}"></span>
						    </div>
						    <div>
						    	<span><label>Product Description</label></span>
						    	<span><input name="product_description" type="text" class="textbox" value="${product.product_description}"></span>
						    </div>
						    <div>
						    	<span><label>Product image</label></span>
						    	<span><input name="product_image" type="text" class="textbox" value="${product.product_image}"></span>
						    </div>
						    <div>
						    	<span><label>Product Price</label></span>
						    	<span><input name="product_price" type="text" class="textbox" value="${product.product_price}"></span>
						    </div>
						    <div>
						    	<span><label>Product Subcategory_name</label></span>
						    	<span><input name="product_subcategory_name" type="text" class="textbox" value="${product.product_subcategory_name}"></span>
						    </div>
						    <div>
						    	<span><label>Product Quantity</label></span>
						    	<span><input name="product_quantity" type="text" class="textbox" value="${product.product_quantity}"></span>
						    </div>
						    <div>
						    	<span><label>Product Rating</label></span>
						    	<span><input name="product_rating" type="text" class="textbox" value="${product.product_rating}"></span>
						    </div>
						     <div>
						    	  <button type="submit" class="btn btn-default">Update</button>
						    </div>
						</form>
					</div><!--/submit form-->
				</div>
				
				<div class="container">
			<div class="row">
				<div class="col-sm-5">
					<div class="signup-form"><!--submit form-->
						
						
						
						
						 
						</div>
					</div><!--/submit form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
	
		<section id="form"><!--form-->
	
			
		</section><!--form-->
	
	
	<jsp:include page="footer.jsp"></jsp:include>
  
    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>