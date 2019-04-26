<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./style/w3.css" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<body>

<!-- Navigation -->
<nav class="w3-bar w3-black" >
<a href="#home" class="w3-button w3-bar-item" ><font face=cursive>B-APS</font></a>
  <a href="#home" class="w3-button w3-bar-item">Home</a>
  <a href="#band" class="w3-button w3-bar-item">Our services</a>
  <a href="#tour" class="w3-button w3-bar-item">AboutUs</a>
  <a href="#contact" class="w3-button w3-bar-item">Menu</a>
 <a href="Login.jsp" class="w3-button w3-bar-item w3-display-topright">Login</a>	
  <a href="Register.jsp" class="w3-button w3-bar-item w3-display-right">Register</a>
</nav>

<section>

<img class="mySlides" src=".\img\sup.png"
  style="width:100%">
  <img class="mySlides" src=".\img\MISSION.jpg"
  style="width:100%">
  <img class="mySlides" src=".\img\1449297288computer-support.jpg"
  style="width:100%">

 </section> 

 <!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-black w3-xlarge">
  <a href="#"><i class="fa fa-facebook-official"></i></a>
  <a href="#"><i class="fa fa-pinterest-p"></i></a>
  <a href="#"><i class="fa fa-twitter"></i></a>
  <a href="#"><i class="fa fa-flickr"></i></a>
  <a href="#"><i class="fa fa-linkedin"></i></a>
  <p class="w3-medium">
  Powered by <a href="Login.jsp" target="_blank">@copyright-csk 2019</a>
  </p>
</footer>
 <script>
// Automatic Slideshow - change image every 3 seconds
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 3000);
}
</script>

</body>
</html>