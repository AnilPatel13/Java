package com.FoodPlaza.Pojo;

public class Food211326
{
	private int FoodId;
	private String FoodName;
	private double FoodPrice;
	private String FoodType;
	private int FoodQuantity;
	private String FoodImages;
	
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
	public double getFoodPrice() {
		return FoodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		FoodPrice = foodPrice;
	}
	public String getFoodType() {
		return FoodType;
	}
	public void setFoodType(String foodType) {
		FoodType = foodType;
	}
	public int getFoodQuantity() {
		return FoodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		FoodQuantity = foodQuantity;
	}
	
	public String getFoodImages() {
		return FoodImages;
	}
	public void setFoodImages(String foodImages) {
		FoodImages = foodImages;
	}
	@Override
	public String toString() {
		return "Food211326 [FoodId=" + FoodId + ", FoodName=" + FoodName
				+ ", FoodPrice=" + FoodPrice + ", FoodType=" + FoodType
				+ ", FoodQuantity=" + FoodQuantity + "]";
	}
	
}
