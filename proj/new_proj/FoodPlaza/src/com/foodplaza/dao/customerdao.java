package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.customer;

public interface customerdao 
{
	boolean addCustomer(customer C);
	boolean updatecustomer(customer C);
	boolean deletecustomer(int CustomerId);
	customer getcustomerbyId(int CustomerId);
	List<customer>DisplayallCustomer();
	boolean adminlogin(String adminname,String password);
	boolean CustomerLogin(String CustomerName,String CustomerPassword);
	boolean ChangeAdminPassword(String Username,String password);
	customer getcustomerbyName(String CustomerName);
}
