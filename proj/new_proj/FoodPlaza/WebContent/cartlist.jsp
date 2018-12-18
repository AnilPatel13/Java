<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.List" %>
   <%@page import="com.foodplaza.pojo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% List<cart>clist=(List<cart>)session.getAttribute("ShowCart");%>
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
	cart cd=clist.get(i);
%>
<tr>
<td><%=cd.getFoodname() %></td>
<td><%=cd.getPrice() %><input type="hidden" name="Foodprice" value=<%=cd.getPrice()%>></td>
<td><input type="number" name="FoodQuantity"></td>
<td><a href="CommonFoodServlet?action=deletecart&cartid=<%=cd.getCartid()%>">DeleteCart</a></td>
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