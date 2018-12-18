<%@page import="com.foodplaza.pojo.food"%>
<%@page import="com.foodplaza.pojo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<% List<feedback>flist=(List<feedback>)request.getAttribute("feedback");%>

<table border="2px" align="center" bgcolor="#FFEFD5">
<th colspan = 14><h3>Feedback List</h3></th>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email ID</th>
<th>Contact</th>
<th>Comments</th>
</tr>
<% for(int i=0;i<flist.size();i++)
{
	
	feedback fd=flist.get(i);

%>
<tr>
<td><%=fd.getFirstname()%></td>
<td><%=fd.getLastname()%></td>
<td><%=fd.getEmail()%></td>
<td><%=fd.getContactno()%></td>
<td><%=fd.getComments()%></td>
<%}%>
</tr>
</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>