<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function validation()
{
	
	//document.write(cname);
	
	var cname=document.getElementById("cname").value;
	if(cname=="")
		{
		document.getElementById("cnameerror").innerHTML="Please enter your name";
		return false;
		}
	var cprice=document.getElementById("cprice").value;
	 if(cprice=="")
		{
		document.getElementById("cpriceerror").innerHTML="Please enter price";
		return false;
		} 
	 var cquant=document.getElementById("cquant").value;
	 if(cquant=="")
		{
		document.getElementById("cquantity").innerHTML="Please enter quantity";
		return false;
		} 
	// 	base();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADD Food</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form action="CommonFoodServlet" method="post">
<input type="hidden" name="action" value="addFood">
<table align="center" bgcolor="#FFEFD5">
<marquee><h1 align="center">ADD FOOD</h1></marquee>

<tr>
<td>Food Name</td>
<td><input type="text" name="foodname" id="cname"></td>
<td><span id="cnameerror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Food Price</td>
<td><input type="text" name="foodprice" id="cprice"></td>
<td><span id="cpriceerror" style="color:red">*</span></td>
</tr>
<tr>
<td>Food type</td>
<td><select name="foodtype">
<option value="veg">veg</option>
<option value="nonveg">NonVeg</option>
<option value="starter">Starter</option>
<option value="starter">Drinks</option>
</select></td>
</tr>
<tr>
<td>Food quantity</td>
<td><input type="text" name="foodquantity" id="cquant"></td>
<td><span id="cquantity" style="color:red">*</span></td>
</tr>
<tr>
<td>
<input type="submit" name="SUBMIT" value="submit" onclick="return validation()" /></td>
<td>
<input type="reset" name="RESET" value="reset"/></td>
</tr>


</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
