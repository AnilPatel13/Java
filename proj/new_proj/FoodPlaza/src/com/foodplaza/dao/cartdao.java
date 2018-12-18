package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.cart;
import com.foodplaza.pojo.order;

public interface cartdao 
{
	boolean addToCart(cart c);
	List<cart>DisplayCart(String Email);
	boolean deletecartbyId(int CartId);
	//boolean placeorder(String emailid);
	int placeorder(String emailid,double totalbill);
	boolean DeleteCart(String email);
	List<order>DisplayAllcart(String Email);
}
