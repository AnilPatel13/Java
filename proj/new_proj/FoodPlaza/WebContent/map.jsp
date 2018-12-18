<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mumbai map</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="templatemo_container">
<jsp:include page="Header.jsp"></jsp:include>
<h2 align="center">MUMBAI MAP</h2>
<table align="center">
<tr>
<td>
<div id="map" style="width:500px;height:500px;background:yellow"></div>

<script>
function myMap() {
  var mapCanvas = document.getElementById("map");
  var mapOptions = {
    center: new google.maps.LatLng(19.075984, 72.877656), zoom:12
  };
  var map = new google.maps.Map(mapCanvas, mapOptions);
}
</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAtgp3YC9S4JWh8Ll5stPJIS3paE__r2W4&callback=myMap"></script>
</td>
</tr>
</table>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>