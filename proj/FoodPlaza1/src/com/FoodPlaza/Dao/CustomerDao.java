package com.FoodPlaza.Dao;

import java.util.List;

import com.FoodPlaza.Pojo.Customer21136;

public interface CustomerDao {
	boolean addCustomer(Customer21136 C);
	boolean updatecustomer(Customer21136 C);
	boolean deletecustomer(int CustomerId);
	Customer21136 getcustomerbyId(int CustomerId);
	List<Customer21136>DisplayallCustomer();
	boolean adminlogin(String adminname,String password);
	boolean CustomerLogin(String CustomerName,String CustomerPassword);
	boolean ChangeAdminPassword(String Username,String password);
	Customer21136 getcustomerbyName(String CustomerName);
}
