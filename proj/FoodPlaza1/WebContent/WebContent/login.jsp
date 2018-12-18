<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function validation()
{
	var cname=document.getElementById("an").value;
    if(cname=="")
		{
		document.getElementById("cnameerror").innerHTML="Please enter user name";
		return false;
		}
    var cpwd=document.getElementById("pw").value;
    if(cpwd=="")
		{
		document.getElementById("pwderror").innerHTML="Please enter password";
		return false;
		}
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% String error=(String)request.getAttribute("error");%>

<%  %>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<div align="center">
<%if(error!=null)
{
 out.print(error);
}

%>
</div>

<form action="CommonCustomerServlet" method=post>
<input type="hidden" name="action" value="login">
<table align="center" bgcolor="#FFEFD5">
<marquee><h1>Login Page</h1></marquee>
<tr>
<td>Type:<select name=type>
<option value="disable selected">--Select--</option>
<option value="admin">Admin</option>
<option value="customer">Customer</option>
</select>
</td>
</tr>
<tr>
<td>User name</td>
<td><input type="text" name="username" id="an"></td>
<td><span id="cnameerror" style="color:red" >*</span></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" id="pw"></td>
<td><span id="pwderror" style="color:red" >*</span></td>
</tr>
<tr>
<td>
<input type="submit" name="SUBMIT" value="submit" onclick="return validation()"/></td>
<td>
<input type="reset" name="RESET" value="reset"/>
</td>
</tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>