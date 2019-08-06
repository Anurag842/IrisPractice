package com.hibernate.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.daos.CustomerDao;
import com.hibernate.entities.Customer;
import com.hibernate.utility.SessionFactoryProvider;

public class CustomerDaoImplementation implements CustomerDao {

	public boolean addCustomer(Customer c) {
		try {
			Session session= SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public Customer getCustomerById(String email) {
	try
	{
		Session session= SessionFactoryProvider.getSF().openSession();
		Customer c=session.get(Customer.class, email);
		if(c!=null)
		{
			return c;
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return null;
	}

	public List<Customer> getAllCustomers() {
		
		try {
		Session session=SessionFactoryProvider.getSF().openSession();
		Query query=session.createQuery("from Customer");
		List<Customer> custList=query.getResultList();
		return custList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
