package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("eml");
		String s2 = request.getParameter("psw");
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			PreparedStatement ps=conn.prepareStatement("select * from usertable where email=? and password=?");
			ps.setString(1, s1);
			ps.setString(2, s2);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				String name=rs.getString(3);
				String email=rs.getString(1);
				String lname=rs.getString(4);
				request.setAttribute("firstname",name);
				request.setAttribute("lastname",lname);
				request.setAttribute("email",email);
				
				HttpSession session=request.getSession();
				session.setAttribute("userEmail",s1);
				
				RequestDispatcher rd= request.getRequestDispatcher("welcomepage");
				rd.include(request,response);
				
				
			}
			else {
				RequestDispatcher rd= request.getRequestDispatcher("Login.html");
				rd.include(request,response);
				out.println("Incorrect details");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

}}
