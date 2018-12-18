<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% String admin=(String)session.getAttribute("admin"); 
String customer=(String)session.getAttribute("customer"); %>

	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_menu">
        <ul>
        	<li class="current"><a href="Index.jsp"><b>Home</b></a></li>
        	 <li><a href="CommonFoodServlet"><b>Food Menu</b></a></li>
        	 <li><a href="map.jsp"><b>MAP</b></a></li>
               <li><a href="contactus.jsp"><b>Contact Us</b></a></li>
               
               
                  
              
           <%if(customer==null && admin==null)
           {%>
                 <li><a href="AddCustomer.jsp"><b>Register</b></a></li>
                 <li><a href="login.jsp"><b>Login</b></a></li>
                 
        	<%} %>   
        
            <%
            if(admin!= null && customer==null)
            {
            %>
            <li><a href="CommonCustomerServlet"><b>Show Customer</b></a></li>
            <li><a href="AddFood.jsp"><b>Add Food</b></a></li>
               <li><a href="changepassword.jsp"><b>Change Password</b></a></li>
                 <li><a href="CommonFeedbackServlet"><b>Feedback</b></a></li>
          <%} %>
           
      
      
      <%
            if(customer!= null && admin==null)
            {
            %>
         
            <li><a href="CommonCustomerServlet?action=Editprofile"><b>Edit Profile</b></a></li>
            
            <li><a href="CommonFoodServlet?action=showcart"><b>Show Cart</b></a></li>
             
      <%} %>
      
       <%
            if(admin!= null || customer!=null)
            {
            %>
            	<li><a href="CommonCustomerServlet?action=logout"><b>Logout</b></a></li>
       <%     }%>
       
           
        </ul>
    </div> <!-- end of menu -->
    

</body>
</html>