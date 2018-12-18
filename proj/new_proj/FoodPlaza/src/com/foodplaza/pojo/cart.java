package com.foodplaza.pojo;

public class cart 
{
private int cartid;
private int foodid;
private String foodname;
private double price;
private String email;
private int foodquantity;
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getFoodquantity() {
	return foodquantity;
}
public void setFoodquantity(int foodquantity) {
	this.foodquantity = foodquantity;
}
@Override
public String toString() {
	return "cart [cartid=" + cartid + ", foodid=" + foodid + ", foodname=" + foodname + ", price=" + price + ", email="
			+ email + ", foodquantity=" + foodquantity + "]";
}

}
