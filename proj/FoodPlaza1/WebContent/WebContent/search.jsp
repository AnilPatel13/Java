<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search tool</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<style>
* {
  box-sizing: border-box;
}

#myInput {
  background-image: url(images/);
  background-position: 10px 12px;
  background-repeat: no-repeat;
  width:25%;
  font-size:16px;
  padding: 10px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myUL {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myUL li a {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  color: black;
  display:block;
}

#myUL li a.header {
  background-color: #e2e2e2;
  cursor: default;
}

#myUL li a:hover:not(.header) {
  background-color: #eee;
}
</style>

</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<h2>Search Item</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<ul id="myUL">
  <li><a href="#" class="header">A</a></li>
  <li><a href="AddFood.jsp">addfood</a></li>
    <li><a href="CommonFoodServlet">allo patty</a></li>
    
  <li><a href="#" class="header">B</a></li>
  <li><a href="#"></a></li>

  <li><a href="#" class="header">C</a></li>
  <li><a href="contactus.jsp">contact us</a></li>
  <li><a href="changepassword.jsp">change password</a></li>
  <li><a href="CommonFoodServlet">Chicken Seekh</a></li>
  <li><a href="CommonFoodServlet">Chicken Tikka</a></li>
  
 <li><a href="#" class="header">D</a></li>
 <li><a href="CommonFoodServlet">Drinks & Sides</a></li>
 <li><a href="CommonFoodServlet">Dessert</a></li>
 <li><a href="CommonFoodServlet">Chicken Seekh</a></li>
 
 <li><a href="#" class="header">E</a></li>
<li><a href="CommonCustomerServlet">Edit profile</a></li>
 
 <li><a href="#" class="header">F</a></li>
  <li><a href="CommonFoodServlet">Food MENU</a></li>
 <li><a href="contactus.jsp">FeedBack</a></li>
 
 <li><a href="#" class="header">G</a></li>
 
 <li><a href="#" class="header">H</a></li>
 <li><a href="#" class="header">I</a></li>
 <li><a href="#" class="header">J</a></li>
 <li><a href="#" class="header">K</a></li>
 <li><a href="#" class="header">L</a></li>
 <li><a href="#" class="header">M</a></li>
 <li><a href="#" class="header">N</a></li>
 <li><a href="#" class="header">O</a></li>
 <li><a href="#" class="header">P</a></li>
 <li><a href="#" class="header">Q</a></li>
 <li><a href="#" class="header">R</a></li>
 <li><a href="#" class="header">S</a></li>
 <li><a href="CommonCustomerServlet">show customer</a></li>
 <li><a href="CommonFoodServlet">show cart</a></li>
 
 <li><a href="#" class="header">T</a></li>
 <li><a href="#" class="header">U</a></li>
 <li><a href="#" class="header">V</a></li>
 <li><a href="#" class="header">W</a></li>
 <li><a href="#" class="header">X</a></li>
 <li><a href="#" class="header">Y</a></li>
 <li><a href="#" class="header">Z</a></li>
</ul>

<script>
function myFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";

        }
    }
}
</script>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>