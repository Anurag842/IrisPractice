package com.hibernate.daoimpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.ProductDao;
import com.hibernate.entities.Product;
import com.hibernate.utility.SessionFactoryProvider;

public class ProductDaoImplementation implements ProductDao {

	public boolean addProduct(Product p) {
		
		try {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateProduct(Product p) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.update(p);
			tx.commit();
			session.close();
			
			return true;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		return false;
		}
	}

	public boolean deleteProduct(int productId) {
		try {
			Product p=new Product();
			p.setProductId(productId);
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.delete(p);
			tx.commit();
			session.close();
			
			
			return true;
			
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}


	}

	public Product getProduct(int productId) {
		
		try {
		Session session=SessionFactoryProvider.getSF().openSession();
		
		Product p=session.get(Product.class, productId);
		
		return p;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
