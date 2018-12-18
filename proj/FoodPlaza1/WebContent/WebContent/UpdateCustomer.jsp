<%@page import="com.FoodPlaza.Pojo.Customer21136"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    >
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Customer</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<%Customer21136 c=(Customer21136)request.getAttribute("customer");%>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form action="CommonCustomerServlet"method="post">
<input type="hidden" name="action" value="updatecustomer">
<marquee><h1 align="center">Update Customer</h1></marquee>
<table align="center">

<tr>
<td>Customer Id:</td>
<td><input type="text" value=<%=c.getCustomerId() %> name="CustomerID" readonly></td>
</tr>
<tr>
<td>Customer Name:</td>
<td><input type="text"value=<%=c.getCustomerName() %> name="CustomerName"></td>
</tr>
<tr>
<td>Customer Contact:</td>
<td><input type="text"value=<%=c.getCustomerContact() %> name="CustomerContact"></td>
</tr>
<tr>
<td>Customer Address:</td>
<td><input type="text"value=<%=c.getCustomerAddress()%> name="CustomerAddress"></td>
</tr>
<tr>
<td>Customer Email:</td>
<td><input type="text"value=<%=c.getCustomerEmail() %> name="CustomerEmail"></td>
</tr>
<tr>
<td>Customer Password:</td>
<td><input type="text"value=<%=c.getCustomerPassword() %> name="CustomerPassword"></td>
</tr>
<tr>
<td><input type="submit" value="updateCustomer"></td>
<td><input type="reset" name="RESET" value="reset"/></td>
</tr>

</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
