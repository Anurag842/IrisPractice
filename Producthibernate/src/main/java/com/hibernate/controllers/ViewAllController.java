package com.hibernate.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.ProductDao;
import com.hibernate.daoimpl.ProductDaoImplementation;
import com.hibernate.entities.Product;

@WebServlet("/viewall")
public class ViewAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		Product p=new Product();
		ProductDao daoObj=new ProductDaoImplementation();
		List<Product> b=daoObj.getAllProducts();
		
		if(b!=null)
		{
			request.setAttribute("eList", b);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllproduct.jsp");
		rd.forward(request, response);
		}
		else
		{
			out.println("error");
		}
	}

}
