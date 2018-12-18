<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.List" %>
   <%@page import="com.FoodPlaza.Pojo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% List<Cart21136>clist=(List<Cart21136>)session.getAttribute("ShowCart");%>
<% 
String customer=(String)session.getAttribute("CustomerName"); %>
<% 
if(customer!=null)
{
	String s=(String)request.getAttribute("Error");
	if(s!=null)
	{
		out.print(s);
	}
}%>
<form action="CommonFoodServlet" method="post">
 <input type="hidden" name="action" value="placeorder">
<table border="2px" align="center" bgcolor="#FFEFD5">
<tr>

<th>FoodName</th>
<th>FoodPrice</th>
<th>FoodQuantity</th>
<th>DeleteFood</th>
</tr>
<% for(int i=0;i<clist.size();i++)
{
	Cart21136 cd=clist.get(i);
%>
<tr>
<td><%=cd.getFoodName() %></td>
<td><%=cd.getFoodPrice() %><input type="hidden" name="Foodprice" value=<%=cd.getFoodPrice()%>></td>
<td><input type="number" name="FoodQuantity"></td>
<td><a href="CommonFoodServlet?action=deletecart&cartid=<%=cd.getCartId()%>">DeleteCart</a></td>
</tr>
<%} %> 
</table>
<table align="center">
<tr>
<td><input type="submit" value="placeorder"></td>
</tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>

</body>
</html>