package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ConnectionCreator implements ServletContextListener {

  
	
    public void contextDestroyed(ServletContextEvent event)  { 
    	
         ServletContext context=event.getServletContext();
        Connection conn=(Connection)context.getAttribute("connObj");
        try {
        	conn.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

	
    public void contextInitialized(ServletContextEvent event)  { 
       
    	ServletContext context = event.getServletContext();
    	String s3=context.getInitParameter("driverName");
		String s4=context.getInitParameter("connString");
		String s5=context.getInitParameter("userName");
		String s6=context.getInitParameter("userPass");
		
		try {
			Class.forName(s3);
			Connection conn=DriverManager.getConnection(s4,s5,s6);
			context.setAttribute("connObj", conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    
    }
	
}
