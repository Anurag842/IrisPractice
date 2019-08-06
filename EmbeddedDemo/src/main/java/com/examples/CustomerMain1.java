package com.examples;

import java.util.HashSet;
import java.util.Set;

import com.hibernate.daoimpl.CustomerDaoImplementation;
import com.hibernate.daos.CustomerDao;
import com.hibernate.entities.Address;
import com.hibernate.entities.Customer;

public class CustomerMain1 {

	public static void main(String[] args) {
		
		
		
		
		
		CustomerDao daoObj= new CustomerDaoImplementation();
		
		Address addr1=new Address(11,"desert","Tatooine");
		Address addr2=new Address(322,"Toplane","Radiant");
		
		Set<Address> addressSet=new HashSet<Address>();
		addressSet.add(addr1);
		addressSet.add(addr2);
		
		Customer c= new Customer("anurag@gmail","Anurag",addressSet);
		
		boolean a=daoObj.addCustomer(c);
		
		System.out.println(c);
		

	}

}
