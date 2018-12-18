package com.FoodPlaza.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity 
{
static Connection conn=null;
	
	public static Connection getDBConnection()
	{
		try
		{
				Class.forName("com.mysql.jdbc.Driver");
			  
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplaza21136","root","dbda");
		return conn;
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
