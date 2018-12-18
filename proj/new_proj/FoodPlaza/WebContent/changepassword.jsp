<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Change Password</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script>
function validation()
{
	var cname=document.getElementById("unm").value;
    if(cname=="")
		{
		document.getElementById("cnameerror").innerHTML="Please enter user name";
		return false;
		}
    var opwd=document.getElementById("op").value;
    if(opwd=="")
		{
		document.getElementById("pwderror").innerHTML="Please enter old password";
		return false;
		}
    var npwd=document.getElementById("np").value;
    if(npwd=="")
		{
		document.getElementById("npwderror").innerHTML="Please enter new password";
		return false;
		}
    var cpwd=document.getElementById("cp").value;
    if(cpwd!=npwd)
		{
		document.getElementById("cpwderror").innerHTML="Please verify the new password again";
		return false;
		}
    return true;
}
</script>
</head>
<body>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>

<form action="CommonCustomerServlet" method="post">
<input type="hidden" name="action" value="changepassword">

<table align="center" bgcolor="#FFEFD5">
<tr>
<td>Type:<select name=type>
<option value="admin">Admin</option>
<option value="customer">Customer</option>
</select>
</td>
</tr>
<tr>
<td>UserName :</td>
<td><input type="text" name="username" id="unm"></td>
<td><span id="cnameerror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Old Password :</td>
<td><input type="password" name="opassword" id="op"></td>
<td><span id="pwderror" style="color:red" >*</span></td>
</tr>
<tr>
<td>New Password :</td>
<td><input type="password" name="npassword" id="np"></td>
<td><span id="npwderror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Confirm Password :</td>
<td><input type="password" name="cpassword" id="cp"></td>
<td><span id="cpwderror" style="color:red" >*</span></td>
</tr>
<tr>
<td><input type="submit" name="SUBMIT" value="Change Password" onclick="return validation()"/></td>
<td><input type="reset" name="RESET" value="reset"/></td>
</tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>