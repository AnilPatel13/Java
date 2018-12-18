package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.feedback;
import com.foodplaza.utility.dbconnectivity;

public class feedbackdaoimpl implements feedbackdao {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String sql=null;
	@Override
	public boolean sendfeedback(feedback f)
	{
		try
		{
			String sql="insert into feedback21136(firstname,lastname,email,contactno,comments)values(?,?,?,?,?)";
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
		ps.setString(1,f.getFirstname());
		ps.setString(2,f.getLastname());
		ps.setString(3,f.getEmail());
		ps.setLong(4,f.getContactno());
		ps.setString(5, f.getComments());
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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<feedback> getallfeedback() 
	{
		List<feedback> feedbacklist=new ArrayList<feedback>();
		String 	sql="select * From FeedBack21136";
		try
		{
			conn=dbconnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				feedback f=new feedback();
				f.setFirstname(rs.getString("firstname"));
				f.setLastname(rs.getString("lastname"));
				f.setEmail(rs.getString("email"));
				f.setContactno(rs.getLong("contactno"));
				f.setComments(rs.getString("comments"));
				feedbacklist.add(f);
			}
			return feedbacklist;
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
		// TODO Auto-generated method stub
		return null;
	}

}
