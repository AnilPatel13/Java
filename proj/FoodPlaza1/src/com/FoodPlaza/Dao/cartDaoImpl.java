package com.FoodPlaza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.FoodPlaza.Pojo.Cart21136;
import com.FoodPlaza.Pojo.Order21136;
import com.FoodPlaza.utility.DBConnectivity;

public class cartDaoImpl implements CartDao
{
	Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql=null;

	@Override
	public boolean addToCart(Cart21136 c) 
	{
		
		String fname=null;
		double fprice=0;
		try 
		{
			conn=DBConnectivity.getDBConnection();
			
		String sql="select FoodName,FoodPrice from Food21136 where FoodId=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,c.getFoodId());
		rs=ps.executeQuery();
		while(rs.next())
		{
			 fname = rs.getString("FoodName");
			 fprice = rs.getDouble("FoodPrice");
		}
		
		
		sql="insert into Cart21136(FoodId,FoodName,FoodPrice,CustomerEmail,FoodQuantity)values(?,?,?,?,?)";
		// TODO Auto-generated method stub
	
			ps=conn.prepareStatement(sql);
			ps.setInt(1,c.getFoodId());
			ps.setString(2,fname);
			ps.setDouble(3,fprice);
			ps.setString(4,c.getCustomerEmail());
			ps.setInt(5,c.getFoodQuantity());
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
	public List<Cart21136> DisplayCart(String Email)
	{
		List<Cart21136> cartlist=new ArrayList<Cart21136>();
		String sql="select * from Cart21136 where CustomerEmail=?";
		
		try 
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,Email);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Cart21136 c=new Cart21136();
				c.setCartId(rs.getInt("CartId"));
				c.setFoodId(rs.getInt("FoodId"));
				c.setFoodName(rs.getString("FoodName"));
				c.setFoodPrice(rs.getDouble("FoodPrice"));
				c.setCustomerEmail(rs.getString("CustomerEmail"));
				c.setFoodQuantity(rs.getInt("FoodQuantity"));
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
		String sql="Delete from Cart21136 where CartId=?";
		try 
		{
			conn=DBConnectivity.getDBConnection();
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
/*public boolean placeorder(String emailid)
{
	double totalbill=0;
	
	try{
		
		conn=DBConnectivity.getDBConnection();
	sql="select sum(FoodPrice*FoodQuantity)as TotalBill from Cart21136 where CustomerEmail=?";
	ps=conn.prepareStatement(sql);
	ps.setString(1,emailid);
	rs=ps.executeQuery();
	while(rs.next())
	{
		totalbill=rs.getDouble("TotalBill");
	}
	sql="insert into FoodOrder21136(CustomerEmailId,TotalBill,Status)values(?,?,?)";
	ps=conn.prepareStatement(sql);
	ps.setString(1,emailid);
	ps.setDouble(2, totalbill);
	ps.setString(3,"processing");
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
			rs.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    return false;
	
}*/

@Override
public List<Order21136> DisplayAllcart(String Email)
{
	List<Order21136> cartlist=new ArrayList<Order21136>();
	String sql="select * from FoodOrder21136 where  CustomerEmailId=?";
	try
	{
		conn=DBConnectivity.getDBConnection();
		ps=conn.prepareStatement(sql);
		ps.setString(1,Email);
		rs=ps.executeQuery();
		while(rs.next())
		{
			Order21136 c=new Order21136();
			c.setOrderId(rs.getInt("OrderId"));
			c.setCustomerEmailId(rs.getString("CustomerEmailID"));
			c.setStatus(rs.getString("Status"));
			c.setTotalBill(rs.getDouble("TotalBill"));
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

@Override
public int placeorder(String emailid, double totalbill)
{
	try
	{
	int orderId=0;
	String orderDate=new Date().toString();
	conn=DBConnectivity.getDBConnection();
	String sql="insert into FoodOrder21136(CustomerEmailId,TotalBill,Status,OrderDate)values(?,?,?,?)";	
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
		String sql="delete from Cart21136 where CustomerEmail=?";
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

}
