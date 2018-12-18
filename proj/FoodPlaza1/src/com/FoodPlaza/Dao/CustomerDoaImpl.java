package com.FoodPlaza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza.Pojo.Customer21136;
import com.FoodPlaza.utility.DBConnectivity;

public class CustomerDoaImpl implements CustomerDao {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String sql=null;
	@Override
	public boolean addCustomer(Customer21136 C) 
	{
		String sql="insert into Customer21136(CustomerID,CustomerName,CustomerContact,CustomerAddress,CustomerEmail,CustomerPassword)values(?,?,?,?,?,?)";
		try 
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,C.getCustomerId());
			ps.setString(2,C.getCustomerName());
			ps.setLong(3,C.getCustomerContact());
			ps.setString(4,C.getCustomerAddress());
			ps.setString(5,C.getCustomerEmail());
			ps.setString(6,C.getCustomerPassword());
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

		// TODO Auto-generated method stub
	
	@Override
	public boolean updatecustomer(Customer21136 C) 
	{
String sql="update Customer21136 set CustomerName=?,CustomerContact=?,CustomerAddress=?,CustomerEmail=?,CustomerPassword=? where CustomerId=?";
		
		try {
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,C.getCustomerName());
			ps.setLong(2, C.getCustomerContact());
			ps.setString(3,C.getCustomerAddress());
			ps.setString(4,C.getCustomerEmail());
			ps.setString(5,C.getCustomerPassword());
			ps.setInt(6,C.getCustomerId());
			
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
	
		// TODO Auto-generated method stub
	//	return false;
	}

	@Override
	public boolean deletecustomer(int CustomerId)
	{
		String sql="delete from Customer21136 where CustomerId=?";
	
	try
	{
		conn=DBConnectivity.getDBConnection();
		ps=conn.prepareStatement(sql);
		ps.setInt(1,CustomerId);
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer21136 getcustomerbyId(int CustomerId)
	{
		
		try
		{
			conn=DBConnectivity.getDBConnection();
			String sql="select * from Customer21136 where CustomerId=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,CustomerId);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Customer21136 f=new Customer21136();
				f.setCustomerId(rs.getInt("CustomerId"));
				f.setCustomerName(rs.getString("CustomerName"));
				f.setCustomerContact(rs.getLong("CustomerContact"));
				f.setCustomerAddress(rs.getString("CustomerAddress"));
				f.setCustomerEmail(rs.getString("CustomerEmail"));
				f.setCustomerPassword(rs.getString("CustomerPassword"));
			
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
	//	return null;
	}

	@Override
	public List<Customer21136> DisplayallCustomer() 
	{
		List<Customer21136> Customerlist=new ArrayList<Customer21136>();
		String 	sql="select * From Customer21136";
		
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				
				Customer21136 f=new Customer21136();
				f.setCustomerId(rs.getInt("CustomerId"));
				f.setCustomerName(rs.getString("CustomerName"));
				f.setCustomerContact(rs.getLong("CustomerContact"));
				f.setCustomerAddress(rs.getString("CustomerAddress"));
				f.setCustomerEmail(rs.getString("CustomerEmail"));
				f.setCustomerPassword(rs.getString("CustomerPassword"));
				Customerlist.add(f);
				
			}
			return Customerlist;
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

	@Override
	public boolean adminlogin(String adminname, String password)
	{
		String 	sql="select * From Admin21136 where adminname=?";
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,adminname);
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(adminname.equals(rs.getString("adminname"))&&password.equals(rs.getString("adminpassword")))
				{
					return true;
				}
			}
		}
		
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CustomerLogin(String CustomerName, String CustomerPassword)
	{
		String 	sql="select * From Customer21136 where CustomerName=?";
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,CustomerName);
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(CustomerName.equals(rs.getString("CustomerName"))&&CustomerPassword.equals(rs.getString("CustomerPassword")))
				{
					return true;
				}
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ChangeAdminPassword(String Username, String password)
	{ 
		String 	sql="update Admin21136 set adminpassword=? where adminname=?";
	
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,password);
			ps.setString(2,Username);
			//rs=ps.executeQuery();
			int l=ps.executeUpdate();
			if(l>0)
			{
				
			     return true;
			}
			else
			{
				return false;
			}                                              
			/*while(rs.next())
			{
				if(Username.equals(rs.getString("adminname"))&&password.equals(rs.getString("adminpassword")))
				{
					return true;
				}
			}*/
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer21136 getcustomerbyName(String CustomerName)
	{
		try
		{
			conn=DBConnectivity.getDBConnection();
			String sql="select * from Customer21136 where CustomerName=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,CustomerName);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Customer21136 f=new Customer21136();
				f.setCustomerId(rs.getInt("CustomerId"));
				f.setCustomerName(rs.getString("CustomerName"));
				f.setCustomerContact(rs.getLong("CustomerContact"));
				f.setCustomerAddress(rs.getString("CustomerAddress"));
				f.setCustomerEmail(rs.getString("CustomerEmail"));
				f.setCustomerPassword(rs.getString("CustomerPassword"));
			
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
	//	return null;

	


	

		// TODO Auto-generated method stub
	

	
		// TODO Auto-generated method stub
	}
	

}
