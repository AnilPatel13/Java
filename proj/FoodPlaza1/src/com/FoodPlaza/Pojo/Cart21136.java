package com.FoodPlaza.Pojo;

public class Cart21136 
{
private int CartId;
private int FoodId;
private String FoodName;
private Double FoodPrice;
private String CustomerEmail;
private int FoodQuantity;
public int getCartId() {
	return CartId;
}
public void setCartId(int cartId) {
	CartId = cartId;
}
public int getFoodId() {
	return FoodId;
}
public void setFoodId(int foodId) {
	FoodId = foodId;
}
public String getFoodName() {
	return FoodName;
}
public void setFoodName(String foodName) {
	FoodName = foodName;
}
public Double getFoodPrice() {
	return FoodPrice;
}
public void setFoodPrice(Double foodPrice) {
	FoodPrice = foodPrice;
}
public String getCustomerEmail() {
	return CustomerEmail;
}
public void setCustomerEmail(String customerEmail) {
	CustomerEmail = customerEmail;
}
public int getFoodQuantity() {
	return FoodQuantity;
}
public void setFoodQuantity(int foodQuantity) {
	FoodQuantity = foodQuantity;
}

@Override
public String toString() {
	return "Cart21136 [CartId=" + CartId + ", FoodId=" + FoodId + ", FoodName="
			+ FoodName + ", FoodPrice=" + FoodPrice + ", CustomerEmail="
			+ CustomerEmail + ", FoodQuantity=" + FoodQuantity + "]";
}

}
