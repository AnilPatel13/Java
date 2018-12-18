package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.customer;
import com.foodplaza.utility.dbconnectivity;

public class customerdaoimpl implements customerdao 
{
 Connection conn=null;
 PreparedStatement ps=null;
 ResultSet rs=null;
 String sql=null;
 
	@Override
	public boolean addCustomer(customer C) 
	{
		String sql="insert into customer21136(CustomerID,CustomerName,CustomerContact,CustomerAddress,CustomerEmail,CustomerPassword)values(?,?,?,?,?,?)";
		try 
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,C.getId());
			ps.setString(2,C.getName());
			ps.setLong(3,C.getContactno());
			ps.setString(4,C.getAddress());
			ps.setString(5,C.getEmail());
			ps.setString(6,C.getPassword());
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
	public boolean updatecustomer(customer C)
	{String sql="update customer21136 set CustomerName=?,CustomerContact=?,CustomerAddress=?,CustomerEmail=?,CustomerPassword=? where CustomerId=?";
	
	try {
		conn=dbconnectivity.getDBConnection();
		ps=conn.prepareStatement(sql);
		ps.setString(1,C.getName());
		ps.setLong(2, C.getContactno());
		ps.setString(3,C.getAddress());
		ps.setString(4,C.getEmail());
		ps.setString(5,C.getPassword());
		ps.setInt(6,C.getId());
		
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
		String sql="delete from customer21136 where CustomerId=?";
		
		try
		{
			conn=dbconnectivity.getDBConnection();
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
	public customer getcustomerbyId(int CustomerId) 
	{try
	{
		conn=dbconnectivity.getDBConnection();
		String sql="select * from customer21136 where CustomerId=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,CustomerId);
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			customer f=new customer();
			f.setId(rs.getInt("CustomerId"));
			f.setName(rs.getString("CustomerName"));
			f.setContactno(rs.getLong("CustomerContact"));
			f.setAddress(rs.getString("CustomerAddress"));
			f.setEmail(rs.getString("CustomerEmail"));
			f.setPassword(rs.getString("CustomerPassword"));
		
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
	public List<customer> DisplayallCustomer() 
	{
		List<customer> Customerlist=new ArrayList<customer>();
		String 	sql="select * From customer21136";
		
		try
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				
				customer f=new customer();
				f.setId(rs.getInt("CustomerId"));
				f.setName(rs.getString("CustomerName"));
				f.setContactno(rs.getLong("CustomerContact"));
				f.setAddress(rs.getString("CustomerAddress"));
				f.setEmail(rs.getString("CustomerEmail"));
				f.setPassword(rs.getString("CustomerPassword"));
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
	public boolean adminlogin(String adminname, String password) {
		String 	sql="select * From admin21136 where adminname=?";
		try
		{
			conn=dbconnectivity.getDBConnection();
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
	public boolean CustomerLogin(String CustomerName, String CustomerPassword) {
		String 	sql="select * From customer21136 where CustomerName=?";
		try
		{
			conn=dbconnectivity.getDBConnection();
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
	public boolean ChangeAdminPassword(String Username, String password) {
		String 	sql="update admin21136 set adminpassword=? where adminname=?";
		
		try
		{
			conn=dbconnectivity.getDBConnection();
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
	public customer getcustomerbyName(String CustomerName) {
		try
		{
			conn=dbconnectivity.getDBConnection();
			String sql="select * from customer21136 where CustomerName=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,CustomerName);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				customer f=new customer();
				f.setId(rs.getInt("CustomerId"));
				f.setName(rs.getString("CustomerName"));
				f.setContactno(rs.getLong("CustomerContact"));
				f.setAddress(rs.getString("CustomerAddress"));
				f.setEmail(rs.getString("CustomerEmail"));
				f.setPassword(rs.getString("CustomerPassword"));
			
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
		
	}
	

}
