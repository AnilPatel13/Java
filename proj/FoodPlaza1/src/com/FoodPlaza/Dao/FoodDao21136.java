package com.FoodPlaza.Dao;

import java.util.List;

import com.FoodPlaza.Pojo.Food211326;

public interface FoodDao21136 {
	boolean addFood(Food211326 food);
	boolean updateFood(Food211326 food);
	boolean deleteFood(int foodid);
	 Food211326 getFoodbyId(int FoodId);
	List<Food211326>DisplayallFood();
}
