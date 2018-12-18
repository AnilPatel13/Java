package com.FoodPlaza.Dao;

import java.util.List;

import com.FoodPlaza.Pojo.Cart21136;
import com.FoodPlaza.Pojo.Order21136;

public interface CartDao {
	boolean addToCart(Cart21136 c);
	List<Cart21136>DisplayCart(String Email);
	boolean deletecartbyId(int CartId);
	//boolean placeorder(String emailid);
	int placeorder(String emailid,double totalbill);
	boolean DeleteCart(String email);
	List<Order21136>DisplayAllcart(String Email);
}
