package com.FoodPlaza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza.Pojo.Food211326;
import com.FoodPlaza.utility.DBConnectivity;

public class FoodDaoImpl21136 implements FoodDao21136 {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String sql=null;
	@Override
	public boolean addFood(Food211326 food)
	{
		String sql="insert into Food21136(FoodName,FoodPrice,Foodtype,FoodQuantity)values(?,?,?,?)";
		try 
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,food.getFoodName());
			ps.setDouble(2, food.getFoodPrice());
			ps.setString(3,food.getFoodType());
			ps.setInt(4,food.getFoodQuantity());
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
	public boolean updateFood(Food211326 food)
	{
       String sql="update Food21136 set FoodName=?,FoodPrice=?,Foodtype=?,FoodQuantity=? where FoodId=? ";
		
		try {
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,food.getFoodName());
			ps.setDouble(2, food.getFoodPrice());
			ps.setString(3,food.getFoodType());
			ps.setInt(4,food.getFoodQuantity());
			ps.setInt(5,food.getFoodId());
			
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
String sql="delete from Food21136 where FoodId=?";
		
		try
		{
			conn=DBConnectivity.getDBConnection();
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
	public Food211326 getFoodbyId(int FoodId)
	{
		
		String sql="select * from Food21136 where FoodId=?";
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,FoodId);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Food211326 f=new Food211326();
				f.setFoodId(rs.getInt("FoodId"));
				f.setFoodName(rs.getString("FoodName"));
				f.setFoodPrice(rs.getDouble("FoodPrice"));
				f.setFoodType(rs.getString("Foodtype"));
				f.setFoodQuantity(rs.getInt("FoodQuantity"));
			
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
	public List<Food211326> DisplayallFood() 
	{
		List<Food211326> foodlist=new ArrayList<Food211326>();
		String 	sql="select * From Food21136";
		
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Food211326 f3=new Food211326();
				f3.setFoodId(rs.getInt("FoodId"));
				f3.setFoodName(rs.getString("FoodName"));
				f3.setFoodPrice(rs.getDouble("FoodPrice"));
				f3.setFoodType(rs.getString("FoodType"));
				f3.setFoodQuantity(rs.getInt("FoodQuantity"));
				f3.setFoodImages(rs.getString("photos"));
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
