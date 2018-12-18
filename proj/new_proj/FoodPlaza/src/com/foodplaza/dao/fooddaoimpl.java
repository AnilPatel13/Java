package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.food;
import com.foodplaza.utility.dbconnectivity;

public class fooddaoimpl implements fooddao {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String sql=null;
	@Override
	public boolean addFood(food food)
	{
		String sql="insert into food21136(FoodName,FoodPrice,Foodtype,FoodQuantity)values(?,?,?,?)";
		try 
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,food.getFoodname());
			ps.setDouble(2, food.getFoodprice());
			ps.setString(3,food.getFoodtype());
			ps.setInt(4,food.getFoodquantity());
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("insert Success fully");
				return true;
			}
			else
			{
				System.out.println("failed to insert");
				return false;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
				ps.close();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean updateFood(food food)
	{
String sql="update food21136 set FoodName=?,FoodPrice=?,Foodtype=?,FoodQuantity=? where FoodId=? ";
		
		try {
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,food.getFoodname());
			ps.setDouble(2, food.getFoodprice());
			ps.setString(3,food.getFoodtype());
			ps.setInt(4,food.getFoodquantity());
			ps.setInt(5,food.getFoodid());
			
			int i=ps.executeUpdate();
		
			
			if(i>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				conn.close();
				ps.close();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean deleteFood(int foodid) 
	{
String sql="delete from food21136 where FoodId=?";
		
		try
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,foodid);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
				ps.close();
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	public food getFoodbyId(int FoodId) 
	{String sql="select * from food21136 where FoodId=?";
	try
	{
		conn=dbconnectivity.getDBConnection();
		ps=conn.prepareStatement(sql);
		ps.setInt(1,FoodId);
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			food f=new food();
			f.setFoodid(rs.getInt("FoodId"));
			f.setFoodname(rs.getString("FoodName"));
			f.setFoodprice(rs.getDouble("FoodPrice"));
			f.setFoodtype(rs.getString("Foodtype"));
			f.setFoodquantity(rs.getInt("FoodQuantity"));
		
		return f;
		
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			conn.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return null;
	// TODO Auto-generated method stub
	//return false;
	}

	@Override
	public List<food> DisplayallFood()
	{
		List<food> foodlist=new ArrayList<food>();
		String 	sql="select * From food21136";
		
		try
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				food f3=new food();
				f3.setFoodid(rs.getInt("FoodId"));
				f3.setFoodname(rs.getString("FoodName"));
				f3.setFoodprice(rs.getDouble("FoodPrice"));
				f3.setFoodtype(rs.getString("FoodType"));
				f3.setFoodquantity(rs.getInt("FoodQuantity"));
				f3.setImages(rs.getString("photos"));
				foodlist.add(f3);
				
			}
			return foodlist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
				ps.close();
				rs.close();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

		// TODO Auto-generated method stub
	


}
