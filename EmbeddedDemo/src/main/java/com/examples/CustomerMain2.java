package com.examples;

import com.hibernate.daoimpl.CustomerDaoImplementation;
import com.hibernate.daos.CustomerDao;
import com.hibernate.entities.Address;
import com.hibernate.entities.Customer;

public class CustomerMain2 {

	public static void main(String[] args) {
		Customer c=new Customer();
		Address addr=new Address();
		
		String email="anurag@gmail";
		CustomerDao daoObj= new CustomerDaoImplementation();
		
		Customer a=daoObj.getCustomerById(email);
		
		System.out.println(a);
		
		
		

	}

}
