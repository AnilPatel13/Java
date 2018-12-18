<%@page import="com.foodplaza.pojo.food"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Food</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form action="CommonFoodServlet"method="post">
<input type="hidden" name="action" value="updatefood">
<marquee><h1 align="center">Update FOOD</h1></marquee>
<table align="center">
<%food F=(food)request.getAttribute("Food");%>
<tr>
<td>FoodId:</td>
<td><input type="text" value=<%=F.getFoodid() %> name="FoodId" readonly></td>
</tr>
<tr>
<td>FoodName:</td>
<td><input type="text"value=<%=F.getFoodname() %> name="FoodName"></td>
</tr>
<tr>
<td>FoodPrice:</td>
<td><input type="text"value=<%=F.getFoodprice() %> name="FoodPrice"></td>
</tr>
<tr>
<td>FoodType:</td>
<td><input type="text"value=<%=F.getFoodtype() %> name="FoodType"></td>
</tr>
<tr>
<td>FoodQuantity:</td>
<td><input type="text"value=<%=F.getFoodquantity() %> name="FoodQuantity"></td>
</tr>
<tr>
<td><input type="submit" value="updatefood"></td>
<td><input type="reset" name="RESET" value="reset"/></td>
</tr>

</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
