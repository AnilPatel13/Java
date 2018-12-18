package com.foodplaza.pojo;

public class order {
private int orderid;
private String customeremail;
private double totalbill;
private String status;
@Override
public String toString() {
	return "order [orderid=" + orderid + ", customeremail=" + customeremail + ", totalbill=" + totalbill + ", status="
			+ status + "]";
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getCustomeremail() {
	return customeremail;
}
public void setCustomeremail(String customeremail) {
	this.customeremail = customeremail;
}
public double getTotalbill() {
	return totalbill;
}
public void setTotalbill(double totalbill) {
	this.totalbill = totalbill;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
