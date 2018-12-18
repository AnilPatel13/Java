<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% String Feedback=(String)request.getAttribute("feedback");
String error=(String)request.getAttribute("Error");
%>
<%
if(Feedback!=null)
{
	out.print("Feedback");
}
if(error!=null)
{
	out.print("error");
}
%>
<h2><mark>General Information</mark></h2>
<table bgcolor="#FFEFD5">
<tr>
<td><b>Company Name:-FoodPlaza-The Family Restaurant</b></td>
</tr>
<tr>
<td><b>Owner Name:-XYZ</b></td>
</tr>
<tr>
<td><b>Contact No:-9757212729/8767644259</b></td>
</tr>
<tr>
<td><b>Email Id:-anilpatel013@hotmail.com</b></td>
</tr><br>
</table>
<form action="CommonFeedbackServlet" method="post">
<input type="hidden" name="action" value="sendfeedback">
<table width="450px" align="left" bgcolor="#FFEFD5">
<h2><mark>FeedBack</mark></h2><br>
<tr>
 <td>
  <b><label for="first_name">First Name *</label></b>
 </td>
 <td valign="top">
  <input  type="text" name="first_name" maxlength="50" size="30">
 </td>
</tr>
<tr>
 <td valign="top"">
  <b><label for="last_name">Last Name *</label></b>
 </td>
 <td valign="top">
  <input  type="text" name="last_name" maxlength="50" size="30">
 </td>
</tr>
<tr>
 <td valign="top">
  <b><label for="email">Email Address *</label></b>
 </td>
 <td valign="top">
  <input  type="text" name="email" maxlength="80" size="30">
 </td>
 
</tr>
<tr>
 <td valign="top">
  <b><label for="telephone">Telephone Number</label></b>
 </td>
 <td valign="top">
  <input  type="text" name="telephone" maxlength="30" size="30">
 </td>
</tr>
<tr>
 <td valign="top">
  <b><label for="comments">Comments *</label></b>
 </td>
 <td valign="top">
  <textarea  name="comments" maxlength="1000" cols="25" rows="6"></textarea>
 </td>
 
</tr>
<tr>
 <td colspan="2" style="text-align:center">
  <input type="submit" value="Submit">  
  <input type="reset" value="Reset"> ( <a href="http://www.foodplaza.com">FoodPlaza.com</a> )
 </td>
</tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>