<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>INDEX</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% String admin=(String)session.getAttribute("admin"); 
String customer=(String)session.getAttribute("customer"); 
String feedback=(String)session.getAttribute("feedback");
%>


<!--  Free CSS Template by TemplateMo.com  --> 
<div id="templatemo_container">
	<jsp:include page="Header.jsp"></jsp:include>
	<div align="center">


<%if(admin!=null)
{
	String s=(String)request.getAttribute("Susscess");
	if(s!=null)
	{
		out.print(s);
	}
}
%>
<%if(feedback!=null)
{
	String s=(String)request.getAttribute("feedback");
	if(s!=null)
	{
		out.print(s);
	}
}
%>
<%
if(customer!=null)
{
	String s=(String)request.getAttribute("Susscess");
	String s1=(String)request.getAttribute("placeorder1");
	if(s!=null)
	{
		out.print(s);
	}
	else if(s1!=null)
	{
		out.print(s1);
	}
}
%>
</div>
   <div id="templatemo_top_dishes">

	

    	<h1>Recommended Dishes</h1>
        <div class="top_dishes_box">
       	  <img src="images/cookies.jpeg" alt="image" height="150" width="205px"/>
          <h2><b></>Dessert</b></h2>
            <p>Try to save room for our freshly baked cookies, hot out the oven and served on a platter with a sweet crumbly taste. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/coca.jpeg" alt="image" height="150" width="205px"/>
            <h2><b></>Drinks & Sides</b></h2>
          <p>Add refreshing drinks or tasty sides perfect to compliment a meal. <a href="#">Read more...</a></p>
        </div>
        
        <div class="top_dishes_box">
       	  <img src="images/san.jpg" alt="image" height="150" width="205px" />
          <h2><b></>Chicken Tikka</b></h2>
          <p>Tender chicken coated in a rich fragrant tikka spice. Try this flavourful Sub today. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/bur.png" alt="image" height="150" width="205px" />
            <h2>Meatball Marinara</h2>
          <p>Our original Sub comes with tender meatballs that are smothered in a rich marinara sauce. Why not top if off with slices of melted cheese?. <a href="#">Read more...</a></p>
        </div>
        
        <div class="cleaner">&nbsp;</div>
    
    </div> <!-- end of top dishes -->
    
    <div id="templatemo_content">
    	<span class="top"></span>
        <div id="templatemo_innter_content">
            
                <div id="templatemo_content_left">
                    <h1>Welcome to our website</h1>
                <img src="images/person.jpg" alt="image" height="250" width="300px" />
                   
                    <p><b></>EAT-FRESH IP Inc</b>. is a privately held INDIAN fast food restaurant franchise that primarily sells submarine sandwiches (subs) and salads.</p>
                  <p>It is owned and operated by XYZ Associates Inc., doing business as EAT-FRESH IP Inc. EAT-FRESH is one of the fastest growing franchises in the world, with 44,852 restaurants in 112 countries and territories as of September 11, 2016. The United States alone has 26,646 outlets. It is the largest single-brand restaurant chain and the largest restaurant operator in the world.</p>
                    <a href="#">Read more...</a>
                    
                  
                    <div class="cleaner_with_height">&nbsp;</div>
                
                </div> <!-- end of content left -->
                
                <div id="templatemo_content_right">
                    <h1><a href="search.jsp">Click For Search</a></h1>
                    <div class="right_column_section">
	                    <h2>SPECIAL OFFER</h2>
                        <img src="images/sp.jpg" alt="image"  height="150" width="210px"/>
                        <p>Some items may not be available in all markets. Prices and participation may vary. Plus applicable taxes. See menu for details.</p>
                        <a href="CommonFoodServlet">Purchase</a>
                     </div>
                
                </div> <!-- end of content right -->
        		<div class="cleaner">&nbsp;</div>
        </div>   
        <div class="cleaner" style="background: #fff;">&nbsp;</div> 	
    </div>


<jsp:include page="Footer.jsp"></jsp:include>
<!--  Free CSS Templates by TemplateMo.com  --> 
</div><!-- end of container -->
<!-- templatemo 082 tea and meal -->
<!-- 
Tea And Meal Template 
http://www.templatemo.com/preview/templatemo_082_tea_and_meal 
-->
</body>
</html>