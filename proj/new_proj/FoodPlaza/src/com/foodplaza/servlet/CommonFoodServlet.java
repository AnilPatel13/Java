package com.foodplaza.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.fooddaoimpl;
import com.foodplaza.dao.cartdaoimpl;
import com.foodplaza.pojo.cart;
import com.foodplaza.pojo.food;


/**
 * Servlet implementation class CommonFoodServlet
 */
@WebServlet("/CommonFoodServlet")
public class CommonFoodServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	food f=new food();
	fooddaoimpl fd=new fooddaoimpl();
    public CommonFoodServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		cartdaoimpl ct=new cartdaoimpl();
		HttpSession s=request.getSession();
		String action=request.getParameter("action");
		String Customeremail=(String)s.getAttribute("customer");
		if(action!=null&&action.equalsIgnoreCase("edit"))
		{
			int foodid=Integer.parseInt(request.getParameter("Foodid"));
		     food f=fd.getFoodbyId(foodid);
		    request.setAttribute("Food", f);
		    RequestDispatcher rd=request.getRequestDispatcher("UpdateFood.jsp");
		    rd.forward(request, response);
		}
		else if(action!=null&&action.equals("delete"))
		{
			
			int Foodid=Integer.parseInt(request.getParameter("Foodid"));
		    boolean b=fd.deleteFood(Foodid);
		    if(b==true)
		    {
		    	response.sendRedirect("CommonFoodServlet");
		    }
		    else
		    {
		    	response.sendRedirect("error.jsp");
		    }
		     
		}
		else if(action!=null&&action.equalsIgnoreCase("addtocart"))
		{
			cart cde=new cart();
			int Fid=Integer.parseInt(request.getParameter("Foodid"));
			
			cde.setCartid(Fid);
			cde.setEmail((String)s.getAttribute("customer"));
			cde.setFoodquantity(1);
			boolean b=ct.addToCart(cde);
			
			if(b==true)
			{
				List<food>flist=fd.DisplayallFood();
				request.setAttribute("Food",flist);
				request.setAttribute("Susscess","Food Added successfully");
				RequestDispatcher rd=request.getRequestDispatcher("FoodList.jsp");
				rd.forward(request, response);
			}
			else
			{
				List<food>flist=fd.DisplayallFood();
				request.setAttribute("Food",flist);
				request.setAttribute("Error","Food not Added cart");
				RequestDispatcher rd=request.getRequestDispatcher("FoodList.jsp");
				rd.forward(request, response);
			}

		}
		else if(action!=null&&action.equalsIgnoreCase("showcart"))
		{
		 Customeremail=(String)s.getAttribute("customer");
			List<cart>clist=ct.DisplayCart(Customeremail);
			if(clist!=null)
			{
				s.setAttribute("ShowCart",clist);
				response.sendRedirect("cartlist.jsp");
			}
		}
		else if(action!=null&&action.equalsIgnoreCase("deletecart"))
		{
			int cartid=Integer.parseInt(request.getParameter("cartid"));
			boolean flag1=ct.deletecartbyId(cartid);
			if(flag1==true)
			{
				List<cart>clist=ct.DisplayCart(Customeremail);
				s.setAttribute("ShowCart",clist);
				response.sendRedirect("cartlist.jsp");
			}
		}
		else
		{
			
		
		food f=new food();
		fooddaoimpl fd=new fooddaoimpl();
			//HttpSession s=request.getSession();
		List<food>flist=fd.DisplayallFood();
		request.setAttribute("Food",flist);
		RequestDispatcher rd=request.getRequestDispatcher("FoodList.jsp");
		rd.forward(request, response);
		// TODO Auto-generated method stub
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession s=request.getSession();
		food f=new food();
		fooddaoimpl fd=new fooddaoimpl();
		String action=request.getParameter("action");
		if(action!=null && action.equals("addFood"))
		{
			String FoodName=request.getParameter("foodname") ;
			f.setFoodname(FoodName);
            double FoodPrice=Double.parseDouble(request.getParameter("foodprice"));
            f.setFoodprice(FoodPrice);
            String Foodtype=request.getParameter("foodtype");
            f.setFoodtype(Foodtype);
            
            int FoodQuantity=Integer.parseInt(request.getParameter("foodquantity"));
            f.setFoodquantity(FoodQuantity);
            boolean b=fd.addFood(f);
           if(b==true)
           {
        	   response.sendRedirect("Index.jsp");
           }
           else
           {
        	   response.sendRedirect("error.jsp");
           }
  		// TODO Auto-generated method stub
	}
		else if(action!=null&&action.equals("updatefood"))
		{
			int id=Integer.parseInt(request.getParameter("FoodId"));
			String name=request.getParameter("FoodName");
			Double price=Double.parseDouble(request.getParameter("FoodPrice"));
			String type=request.getParameter("FoodType");
			int quant=Integer.parseInt(request.getParameter("FoodQuantity"));
			f.setFoodid(id);
			f.setFoodname(name);
			f.setFoodprice(price);
			f.setFoodtype(type);
			f.setFoodquantity(quant);
			boolean flag=fd.updateFood(f);
			if(flag)
			{
			response.sendRedirect("CommonFoodServlet");
			
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		
		}
		else if(action!=null&&action.equalsIgnoreCase("placeorder"))
			
		{
			double totalbill=0;
			cart c=new cart();
			cartdaoimpl cd=new cartdaoimpl();
			
			//c.setCustomerEmail(Customeremail);
			//boolean c1=cd.placeorder(Customeremail);
			String FoodPrice[]=request.getParameterValues("Foodprice");
			String FoodQuantity[]=request.getParameterValues("FoodQuantity");
			
			for(int i=0;i<FoodPrice.length;i++)
			{
				totalbill=totalbill+(Double.parseDouble(FoodPrice[i])*Integer.parseInt(FoodQuantity[i]));
				
			}
			String Customeremail=(String)s.getAttribute("customer");
			int orderId=cd.placeorder(Customeremail, totalbill);
			if(orderId>0)
			{
				boolean b=cd.DeleteCart(Customeremail);
				if(b)
				{
					request.setAttribute("placeorder1","order place successfully your bill="+totalbill);
					RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
					rd.forward(request, response);
				}
				//request.setAttribute("Success","order place successfully");
				//RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
				//rd.forward(request, response);
			else
			{
				request.setAttribute("Error","order place unsuccessfully");
				RequestDispatcher rd=request.getRequestDispatcher("cartlist.jsp");
				rd.forward(request, response);
			}
			}
		}
	}
}
