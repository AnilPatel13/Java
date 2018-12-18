<%@page import="com.FoodPlaza.Pojo.Food211326"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FoodList</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% List<Food211326>foodlist=(List<Food211326>)request.getAttribute("Food");
String admin=(String)session.getAttribute("admin"); 
String customer=(String)session.getAttribute("customer");
if(customer!=null)
{
	String s=(String)request.getAttribute("Susscess");
	if(s!=null)
	{
		out.print(s);
	}
}

%>
<table border="1px" align="center" bgcolor="#FFEFD5">
<th colspan = 14><h3>FOOD MENU</h3></th>
<tr>
<th>Food Id</th>
<th>Food Name</th>
<th>Food Price</th>
<th>Food Type</th>
<th>Photos</th>

</tr>
<% for(int i=0;i<foodlist.size();i++)
{
	
Food211326 fd=foodlist.get(i);

%>
<tr>
<td><%=fd.getFoodId() %></td>
<td><%=fd.getFoodName() %></td>
<td><%=fd.getFoodPrice()%></td>
<td><%=fd.getFoodType() %></td>
<td colspan = 4><img src=<%=fd.getFoodImages() %> alt="" border=3 height=100 width=100></img></td><br>



<% if(admin!=null&&customer==null) 
    {%>
    
    <td><a href="CommonFoodServlet?action=edit&Foodid=<%=fd.getFoodId()%>">Edit</a></td>
    <td><a href="CommonFoodServlet?action=delete&Foodid=<%=fd.getFoodId()%>">Delete</a></td>

   <%} %>
  
   <%if(admin==null&&customer!=null) 
   {
   %>
 
    <td><a href="CommonFoodServlet?action=addtocart&Foodid=<%=fd.getFoodId()%>">Add to Cart</a></td>
  
   <%} %></tr>
    <%} %>

</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
