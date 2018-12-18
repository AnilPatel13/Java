<%@page import="com.FoodPlaza.Pojo.Customer21136"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.List" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer List</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% List<Customer21136>Customerlist=(List<Customer21136>)request.getAttribute("Customer");%>
<table align="center" border="2px" bgcolor="#FFEFD5">
<th colspan = 14><h3>Customer List</h3></th>
<tr>
<th>Customer Id</th>
<th>Customer Name</th>
<th>Customer Contact</th>
<th>Customer Address</th>
<th>Customer Email</th>
<th>Customer Password</th>
</tr>
<% for(int i=0;i<Customerlist.size();i++)
{
	Customer21136 cd=Customerlist.get(i);
%>
<tr>
<td><%=cd.getCustomerId()%></td>
<td><%=cd.getCustomerName() %></td>
<td><%=cd.getCustomerContact()%></td>
<td><%=cd.getCustomerAddress()%></td>
<td><%=cd.getCustomerEmail()%></td>
<td><%=cd.getCustomerPassword()%></td>
<td><a href="CommonCustomerServlet?action=edit&customerid=<%=cd.getCustomerId()%>">Edit</a></td>
<td><a href="CommonCustomerServlet?action=delete&customerid=<%=cd.getCustomerId()%>">Delete</a></td>
<!--  <td><a href="CommonCustomerServlet?action=editprofile&CustomerName=<%=cd.getCustomerName()%>">EditProfile</a></td>-->
</tr>
<%} %>
</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
