package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.foodplaza.pojo.cart;
import com.foodplaza.pojo.order;
import com.foodplaza.utility.dbconnectivity;

public class cartdaoimpl implements cartdao
{
	Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql=null;
	@Override
	public boolean addToCart(cart c) 
	{
		String fname=null;
		double fprice=0;
		try 
		{
			conn=dbconnectivity.getDBConnection();
			
		String sql="select FoodName,FoodPrice from food21136 where FoodId=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,c.getFoodid());
		rs=ps.executeQuery();
		while(rs.next())
		{
			 fname = rs.getString("FoodName");
			 fprice = rs.getDouble("FoodPrice");
		}
		
		sql="insert into cart21136(FoodId,FoodName,FoodPrice,CustomerEmail,FoodQuantity)values(?,?,?,?,?)";
		// TODO Auto-generated method stub
	
			ps=conn.prepareStatement(sql);
			ps.setInt(1,c.getFoodid());
			ps.setString(2,fname);
			ps.setDouble(3,fprice);
			ps.setString(4,c.getEmail());
			ps.setInt(5,c.getFoodquantity());
			int i=ps.executeUpdate();
			if(i>0)
			{
				/*System.out.println("insert Success fully");*/
				return true;
			}
			else
			{
				/*System.out.println("failed to insert");*/
				return false;
			}
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
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public List<cart> DisplayCart(String Email)
	{
		List<cart> cartlist=new ArrayList<cart>();
		String sql="select * from cart21136 where CustomerEmail=?";
		
		try 
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,Email);
			rs=ps.executeQuery();
			while(rs.next())
			{
				cart c=new cart();
				c.setCartid(rs.getInt("CartId"));
				c.setFoodid(rs.getInt("FoodId"));
				c.setFoodname(rs.getString("FoodName"));
				c.setPrice(rs.getDouble("FoodPrice"));
				c.setEmail(rs.getString("CustomerEmail"));
				c.setFoodquantity(rs.getInt("FoodQuantity"));
				cartlist.add(c);
				
			
			}
			
			return cartlist;
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
			//	rs.close();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		// TODO Auto-generated method stub
	//	return null;
	}

	@Override
	public boolean deletecartbyId(int CartId) 
	{
		String sql="Delete from cart21136 where CartId=?";
		try 
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,CartId);
		int i=ps.executeUpdate();
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
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
				//rs.close();
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int placeorder(String emailid, double totalbill) 
	{
		try
		{
		int orderId=0;
		String orderDate=new Date().toString();
		conn=dbconnectivity.getDBConnection();
		String sql="insert into foodorder21136(CustomerEmailId,TotalBill,Status,OrderDate)values(?,?,?,?)";	
		ps=conn.prepareStatement(sql);
		ps.setString(1,emailid);
		ps.setDouble(2,totalbill);
		ps.setString(3,"processing");
		ps.setString(4,orderDate);
		int i=ps.executeUpdate();
		if(i>0)
		{
			sql="select OrderId from FoodOrder21136 where CustomerEmailId=? and OrderDate=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,emailid);
			ps.setString(2,orderDate);
			rs=ps.executeQuery();
			while(rs.next())
			{
				orderId=rs.getInt("OrderId");
			}
			return orderId;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;
		
	}
	


	@Override
	public boolean DeleteCart(String email) 
	{
		try
		{
			String sql="delete from cart21136 where CustomerEmail=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,email);
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
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
					//rs.close();
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return false;
	    }

	

	@Override
	public List<order> DisplayAllcart(String Email)
	{
		List<order> cartlist=new ArrayList<order>();
		String sql="select * from foodorder21136 where  CustomerEmailId=?";
		try
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,Email);
			rs=ps.executeQuery();
			while(rs.next())
			{
				order c=new order();
				c.setOrderid(rs.getInt("OrderId"));
				c.setCustomeremail(rs.getString("CustomerEmailID"));
				c.setStatus(rs.getString("Status"));
				c.setTotalbill(rs.getDouble("TotalBill"));
		//		c.setCustomerEmail(rs.getString("CustomerEmail"));
			//	c.setFoodQuantity(rs.getInt("FoodQuantity"));
				cartlist.add(c);
			}
		return cartlist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
}
