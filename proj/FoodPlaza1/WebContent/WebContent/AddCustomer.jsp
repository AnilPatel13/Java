<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
function validation()
{
	//var id=document.getElementById("cid").value;
	
	
//	var cn=document.getElementById("contactnum").value;
	//var pd=document.getElementById("password").value;
	//var add=document.getElementById("address").value; 
	/* var cid=document.getElementById("cid").value;
	if(cid=="")
		{
		document.getElementById("ciderror").innerHTML="Please enter your id";
		return false;
		} */
	var cname=document.getElementById("cname").value;
    if(cname=="")
		{
		document.getElementById("cnameerror").innerHTML="Please enter your name";
		return false;
		}
    var eid=document.getElementById("eid").value;
	if(eid=="")
		{
		document.getElementById("eiderror").innerHTML="Please enter your email id";
		return false;
		}
	var cn=document.getElementById("cn").value;
	if(cn=="")
		{
		document.getElementById("cnerror").innerHTML="Please enter your contact number";
		return false;
		}
	var pd=document.getElementById("pd").value;
	if(pd=="")
		{
		document.getElementById("pderror").innerHTML="Please enter your password";
		return false;
		}
	var add=document.getElementById("add").value; 
	if(add=="")
	{
	document.getElementById("adderror").innerHTML="Please enter your address";
	return false;
	} 
  return true;
}
</script>
<title>ADD CUSTOMER</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<form action="CommonCustomerServlet" method="post">
<input type="hidden" name="action" value="addcustomer">

<h1 align="center">ADD CUSTOMER</h1>
<table align="center" bgcolor="#FFEFD5">
<!--  
<tr>
<td>Customer Id</td>
<td><input type="text" name="customerid" id="cid"></td>
<td><span id="ciderror" style="color:red" >*</span></td>
</tr>
-->
<tr>
<td>Customer Name</td>
<td><input type="text" name="customername" id="cname"></td>
<td><span id="cnameerror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Customer EmailId</td>
<td><input type="text" name="emailid" id="eid"></td>
<td><span id="eiderror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Customer Contact number</td>
<td><input type="text" name="contactnum" id="cn"></td>
<td><span id="cnerror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" id="pd"></td>
<td><span id="pderror" style="color:red" >*</span></td>
</tr>
<tr>
<td>CustomerAddress</td>
<td><input type="text" name="address" id="add"></td>
<td><span id="adderror" style="color:red" >*</span></td>
</tr>

<tr>
<td></td>
<td><input type="submit" name="SUBMIT" value="submit" onclick="return validation()"/></td>
<td><input type="reset" value="clear"></td>
</tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>
