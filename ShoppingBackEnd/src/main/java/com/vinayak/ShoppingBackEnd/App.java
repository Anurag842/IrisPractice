package com.vinayak.ShoppingBackEnd;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.model.Category;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Category c=new Category();
    	c.setCategoryId("2");
    	c.setCategoryName("Womens Wear");
    	c.setDescription("Formal and Casual Wear");
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
        
        /*obj.addCategory(c);
        System.out.println("Category Added");*/
        
        List<Category> categories=obj.getAllCategories();
        for(Category cObj:categories) {
        	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName());
        }
        
        
    }
}
