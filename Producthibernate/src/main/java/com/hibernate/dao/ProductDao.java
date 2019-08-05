package com.hibernate.dao;

import java.util.List;

import com.hibernate.entities.Product;

public interface ProductDao {
	public boolean addProduct(Product p);
	public boolean updateProduct(Product p);
	public boolean deleteProduct(int productId);
	public Product getProduct(int productId);
	public List<Product> getAllProducts();

}
