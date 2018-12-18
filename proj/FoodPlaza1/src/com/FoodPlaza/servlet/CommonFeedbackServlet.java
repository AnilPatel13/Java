package com.FoodPlaza.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.FoodPlaza.Dao.FeedbackbackDaoimpl;
import com.FoodPlaza.Pojo.Feedback21136;



/**
 * Servlet implementation class CommonFeedbackServlet
 */
@WebServlet("/CommonFeedbackServlet")
public class CommonFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommonFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Feedback21136 f=new Feedback21136();
		FeedbackbackDaoimpl fd=new FeedbackbackDaoimpl();
		HttpSession s=request.getSession();
		String action=request.getParameter("action");
		
		List<Feedback21136>flist=fd.getallfeedback();
		request.setAttribute("feedback",flist);
		request.setAttribute("Error","feedback not given");
		RequestDispatcher rd=request.getRequestDispatcher("feedbacklist.jsp");
		rd.forward(request,response);
		// TODO Auto-generated method stub
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Feedback21136 f=new Feedback21136();
		FeedbackbackDaoimpl fd=new FeedbackbackDaoimpl();
		HttpSession s=request.getSession();
		String action=request.getParameter("action");
		if(action!=null && action.equals("sendfeedback"))
		{
			String firstname=request.getParameter("first_name") ;
			f.setFirstname(firstname);
			String lastname=request.getParameter("last_name") ;
			f.setLastname(lastname);
			
			String CustomerEmail=request.getParameter("email");
	           f.setEmail(CustomerEmail);
            long CustomerContact=Long.parseLong(request.getParameter("telephone"));
           f.setContactno(CustomerContact);
           
            String comment=request.getParameter("comments");
           f.setComments(comment);
           boolean b=fd.sendfeedback(f);
           if(b==true)
           {
        	   request.setAttribute("feedback","Thanks For your feedback!!!!");
        	   RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
        	rd.forward(request, response);
           }
           else
           {
        	   request.setAttribute("Error","Please Try Again!!!!");
        	   RequestDispatcher rd=request.getRequestDispatcher("contactus.jsp");
        	rd.forward(request, response);
           }
		}
		// TODO Auto-generated method stub
	}

}
