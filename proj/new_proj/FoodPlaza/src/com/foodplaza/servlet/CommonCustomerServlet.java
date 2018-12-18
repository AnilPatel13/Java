package com.foodplaza.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.customerdaoimpl;
import com.foodplaza.pojo.customer;
import com.foodplaza.dao.customerdaoimpl;
import com.foodplaza.pojo.customer;


/**
 * Servlet implementation class CommonCustomerServlet
 */
@WebServlet("/CommonCustomerServlet")

public class CommonCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HttpSession session=null;
	customer c=new customer();
	customerdaoimpl cd=new customerdaoimpl();
    public CommonCustomerServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		session=request.getSession();
		String action=request.getParameter("action");
		if(action!=null&&action.equalsIgnoreCase("edit"))
		{
			int customerid=Integer.parseInt(request.getParameter("customerid"));
		     customer c=cd.getcustomerbyId(customerid);
		    request.setAttribute("customer",c);
		    RequestDispatcher rd=request.getRequestDispatcher("UpdateCustomer.jsp");
		    rd.forward(request, response);
		}
		else if(action!=null&&action.equals("Editprofile"))
		{
		   String name=(String)session.getAttribute("customer");
		    c=cd.getcustomerbyName(name);
		    request.setAttribute("customer",c);
		    RequestDispatcher rd=request.getRequestDispatcher("UpdateCustomer.jsp");
		    rd.forward(request,response);

		    
		}
		else if(action!=null&&action.equals("delete"))
		{
			
			int Customerid=Integer.parseInt(request.getParameter("customerid"));
		    boolean b=cd.deletecustomer(Customerid);
		    if(b==true)
		    {
		    	response.sendRedirect("CommonCustomerServlet");
		    }
		    else
		    {
		    	response.sendRedirect("error.jsp");
		    }
		     
		}
		
		else if(action!=null && action.equalsIgnoreCase("logout"))
		{
			session.invalidate();
			response.sendRedirect("Index.jsp");
		}
		
		else
		{
			customer c=new customer();
			customerdaoimpl cd=new customerdaoimpl();
		//HttpSession s=request.getSession();
	        List<customer>clist=cd.DisplayallCustomer();
	        request.setAttribute("Customer",clist);
	        RequestDispatcher rd=request.getRequestDispatcher("CustomerList.jsp");
	        rd.forward(request, response);
			// TODO Auto-generated method stub
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		customer c=new customer();
		customerdaoimpl cd=new customerdaoimpl();
		String action=request.getParameter("action");
		if(action!=null && action.equals("addcustomer"))
		{
			String customername=request.getParameter("customername") ;
			c.setName(customername);
            long CustomerContact=Long.parseLong(request.getParameter("contactnum"));
            c.setContactno(CustomerContact);
            String CustomerAddress=request.getParameter("address");
           c.setAddress(CustomerAddress);
            
           String CustomerEmail=request.getParameter("emailid");
           c.setEmail(CustomerEmail);
           String CustomerPassword=request.getParameter("password");
           c.setPassword(CustomerPassword);
            boolean b=cd.addCustomer(c);
           if(b==true)
           {
        	   response.sendRedirect("success.jsp");
           }
           else
           {
        	   response.sendRedirect("error.jsp");
           }
  		// TODO Auto-generated method stub
	}
		else if(action!=null&&action.equals("updatecustomer"))
		{
			int id=Integer.parseInt(request.getParameter("CustomerID"));
			String name=request.getParameter("CustomerName");
			long contact=Long.parseLong(request.getParameter("CustomerContact"));
			String address=request.getParameter("CustomerAddress");
			String email=request.getParameter("CustomerEmail");
			String password=request.getParameter("CustomerPassword");
			c.setId(id);
			c.setName(name);
		    c.setContactno(contact);
			c.setAddress(address);
			c.setEmail(email);
			c.setPassword(password);
			boolean flag=cd.updatecustomer(c);
			if(flag)
			{
				response.sendRedirect("CommonCustomerServlet");
			}
			
			else
			{
				response.sendRedirect("error.jsp");
			}
			
		}
		else if(action!=null&&action.equalsIgnoreCase("login"))
		{
			session=request.getSession();
		String	type=request.getParameter("type");
		String	username=request.getParameter("username");
		String	password=request.getParameter("password");
			
		if(type.equalsIgnoreCase("admin"))
		{
			
			boolean b=cd.adminlogin(username, password);
			if(b==true)
			{
				session.setAttribute("admin",username);
				request.setAttribute("Susscess","Welcome "+username+" to FoodPlaza");
				RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
				rd.forward(request, response);
				//response.sendRedirect("Index.jsp");
			}
			else
			{
				request.setAttribute("error","please enter the username and password once again");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				//response.sendRedirect("error.jsp");
			}
			
		}
		else if(type!=null && type.equals("customer"))
		{
			
			boolean b=cd.CustomerLogin(username, password);
			if(b==true)
			{
				session.setAttribute("customer",username);
				request.setAttribute("Susscess","Welcome "+username+" to FoodPlaza");
			RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
			rd.forward(request, response);
			
				//response.sendRedirect("Index.jsp");		
			}
			else
			{
				//Session.setAttribute("error","please enter the username and password once again");
			request.setAttribute("error","please enter the username and password once again");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				//response.sendRedirect("error.jsp");
			}
		}
	}
		else if(action!=null && action.equalsIgnoreCase("changepassword"))
		{
			
			String user=request.getParameter("username");
			String oldpass=request.getParameter("opassword");
			String npass=request.getParameter("npassword");
			
			boolean b1=cd.adminlogin(user,oldpass);
			if(b1==true)
			{
				boolean b=cd.ChangeAdminPassword(user,npass);
				if(b==true)
				{
					response.sendRedirect("index.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
				
			}
			
			else
			{
				response.sendRedirect("error.jsp");
			}
		
	
		}
		
	}
	}
