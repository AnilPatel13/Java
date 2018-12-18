package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.food;

public interface fooddao {
	boolean addFood(food food);
	boolean updateFood(food food);
	boolean deleteFood(int foodid);
	food getFoodbyId(int FoodId);
	List<food>DisplayallFood();
}
