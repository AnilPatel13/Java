package com.FoodPlaza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.FoodPlaza.Pojo.Feedback21136;
import com.FoodPlaza.utility.DBConnectivity;

public class FeedbackbackDaoimpl implements Feedbackdao {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String sql=null;
	
	public boolean sendfeedback(Feedback21136 f)
	{
		try
		{
			String sql="insert into FeedBack21136(firstname,lastname,email,contactno,comments)values(?,?,?,?,?)";
			conn=DBConnectivity.getDBConnection();
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

	
	public List<Feedback21136> getallfeedback()
	{
		List<Feedback21136> feedbacklist=new ArrayList<Feedback21136>();
		String 	sql="select * From FeedBack21136";
		try
		{
			conn=DBConnectivity.getDBConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Feedback21136 f=new Feedback21136();
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
