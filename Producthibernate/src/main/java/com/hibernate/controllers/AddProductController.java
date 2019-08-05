package com.hibernate.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.ProductDao;
import com.hibernate.daoimpl.ProductDaoImplementation;
import com.hibernate.entities.Product;

@WebServlet("/add")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("productname");
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		Product p= new Product();
		p.setPrice(price);
		p.setProductName(name);
		p.setQuantity(quantity);
		
		ProductDao daoObj=new ProductDaoImplementation();
		boolean a=daoObj.addProduct(p);
		
		if(a==true)
		{
			out.println("Product added");
			
		}
		else
		{
			out.println("error");
		}
	}

}
