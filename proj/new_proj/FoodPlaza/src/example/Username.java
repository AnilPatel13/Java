package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Username
 */
//@WebServlet("/Username")
public class Username extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Username() 
    {
        super();
        
        // TODO Auto-generated constructor stub
    }
    String name;
    String age;
    public void init(ServletConfig config)throws ServletException{
    name=config.getInitParameter("name1");
    //age=config.getInitParameter("age1");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext sc=request.getServletContext();
		out.println("<br><br><b>ServletConfig Parameters</b>");
		out.println("<br><b>Name is:-"+name+"</b>");
	//	out.println("<br><b>Age is:-"+age+"</b>");
		sc.setAttribute("capital", "new delhi ");
		String email=sc.getInitParameter("email1");
		String country=sc.getInitParameter("country1");
		String cname=sc.getInitParameter("cname1");
		out.println("<br><br><b>ServletContext Parameters</b>");
		out.println("<br><b>Email is:-"+email+"</b>");
		out.print("<br><b>Country name is:- " + country+"</b>");
		out.print("<br><b>Company name is:- " + cname+"</b>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
