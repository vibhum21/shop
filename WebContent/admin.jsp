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
    
       <style>


tr:nth-child(even){background-color: #f2f2f2}
tr:nth-child(odd){background-color: white}

</style>  
    
</head><!--/head-->

<body>
<jsp:include page="header.jsp"/>
<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-5">
					<div class="signup-form"><!--submit form-->
						<h2>New Product Details!</h2>
						<sf:form modelAttribute="command" action="addProduct">
							Name<input type="text" name="product_name" placeholder="Name"/>
							Brand<input type="text" name="product_brand" placeholder="Brand"/>
							Description<input type="text" name="product_description" placeholder="Description"/>
							Image Location<input type="text" name="product_image" placeholder="image"/>
							Price<input type="text" name="product_price" placeholder="Price"/>
							Subcategory name<input type="text" name="product_subcategory_name" placeholder="Subcategory name"/>
							Quantity<input type="number" name="product_quantity" placeholder="Quantity"/>
							Rating<input type="text" name="product_rating" placeholder="Rating"/>
							<h3>File Upload:</h3>
								Select a file to upload: <br />
							  	<sf:form action="UploadServlet" method="post"
								                        enctype="multipart/form-data">
								<input type="file" name="file" size="50" />
								<br />
							  	 <li><a href="uploadfile">Upload</a></li>
							
							     <button type="submit" class="btn btn-default">Submit</button>
						       </sf:form>
						</sf:form>
					</div><!--/submit form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="container">
			<div class="row">
				<div class="col-sm-5">
					<div class="signup-form"><!--submit form-->
						<h2>View List..</h2>
						<li><a href="viewproduct">View</a></li>
						
						
						 <div style="height:600px;width:500px;overflow:auto;;
                          color:black;scrollbar-base-color:gold;
                          font-family:sans-serif;padding:10px;background-color:orange;tr:nth-child(even){background-color: #f2f2f2}">
                             <table cellpadding="10"  width="100%">
                          <c:forEach var="product" items="${productlist}">
                          <tr>
                         
                               <td> ${product.product_id}</br>
                               <a href="delete?id=${product.product_id}">Delete</a></br>
						        <a href="fetchEditProductById?id=${product.product_id}">Edit</a>
						        </td>
						        
						       <td> ${product.product_name}</td>
						       <td> ${product.product_brand}</td>
						       <td> ${product.product_price}</td>
						      <td> <div style="height:100px;width:100px"class="productinfo text-center">
								<img src="images/home/${product.product_image }" alt="" />
						       </div></td>
						       
						   
						   </tr>
						</c:forEach>
						</table>
					
						
						
						
						</div>
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