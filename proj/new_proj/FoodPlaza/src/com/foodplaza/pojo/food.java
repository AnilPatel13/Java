package com.foodplaza.pojo;

public class food 
{
private int foodid;
private String foodname;
private double foodprice;
private String foodtype;
private int foodquantity;
private String images;
@Override
public String toString() {
	return "food [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + ", foodtype=" + foodtype
			+ ", foodquantity=" + foodquantity + ", images=" + images + "]";
}
public int getFoodid() {
	return foodid;
}
public void setFoodid(int foodid) {
	this.foodid = foodid;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public double getFoodprice() {
	return foodprice;
}
public void setFoodprice(double foodprice) {
	this.foodprice = foodprice;
}
public String getFoodtype() {
	return foodtype;
}
public void setFoodtype(String foodtype) {
	this.foodtype = foodtype;
}
public int getFoodquantity() {
	return foodquantity;
}
public void setFoodquantity(int foodquantity) {
	this.foodquantity = foodquantity;
}
public String getImages() {
	return images;
}
public void setImages(String images) {
	this.images = images;
}

}
