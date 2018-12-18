<%@page import="com.foodplaza.pojo.customer"%>
<%@page import="com.foodplaza.pojo.customer"%>
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
<% List<customer>Customerlist=(List<customer>)request.getAttribute("Customer");%>
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
	customer cd=Customerlist.get(i);
%>
<tr>
<td><%=cd.getId()%></td>
<td><%=cd.getName() %></td>
<td><%=cd.getContactno()%></td>
<td><%=cd.getAddress()%></td>
<td><%=cd.getEmail()%></td>
<td><%=cd.getPassword()%></td>
<td><a href="CommonCustomerServlet?action=edit&customerid=<%=cd.getId()%>">Edit</a></td>
<td><a href="CommonCustomerServlet?action=delete&customerid=<%=cd.getId()%>">Delete</a></td>
<!--  <td><a href="CommonCustomerServlet?action=editprofile&CustomerName=<%=cd.getName()%>">EditProfile</a></td>-->
</tr>
<%} %>
</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
