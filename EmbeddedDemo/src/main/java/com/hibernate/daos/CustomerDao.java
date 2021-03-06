package com.hibernate.daos;

import java.util.List;

import com.hibernate.entities.Customer;

public interface CustomerDao {
	public boolean addCustomer(Customer c);
	public Customer getCustomerById(String email);
	public List<Customer> getAllCustomers();

}
