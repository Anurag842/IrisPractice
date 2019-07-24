package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String usermail =(String)session.getAttribute("userEmail");
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			PreparedStatement ps=conn.prepareStatement("select * from usertable where email=?");
			ps.setString(1, usermail);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				String fname=rs.getString(3);
				String email=rs.getString(1);
				String lname=rs.getString(4);
				String gender=rs.getString(5);
				String age=rs.getString(6);
				
				out.println("Name- "+fname);
				out.println(" "+lname);
				out.println("<div><br></div>");
				out.println("Email- "+email);
				out.println("<div><br></div>");
				out.println("Age- "+age);
				out.println("<div><br></div>");
				out.println("Gender- "+gender);
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
