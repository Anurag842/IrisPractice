package com.examples;

import com.hibernate.daoimpl.CustomerDaoImplementation;
import com.hibernate.daos.CustomerDao;
import com.hibernate.entities.Address;
import com.hibernate.entities.Customer;

public class CustomerMain1 {

	public static void main(String[] args) {
		
		
		
		Address addr1=new Address(12,"Wajidpur","Noida");
		Address addr2=new Address(52,"Bansdroni","Kolkata");
		
		Customer c= new Customer("anurag@gmail","Anurag Dutta",addr1,addr2);
		
		CustomerDao daoObj= new CustomerDaoImplementation();
		
		boolean a=daoObj.addCustomer(c);
		
		System.out.println(c);
		

	}

}
