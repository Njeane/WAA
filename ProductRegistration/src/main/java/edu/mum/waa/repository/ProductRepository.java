package edu.mum.waa.repository;

import edu.mum.waa.domain.Product;

import java.util.List;


 public interface ProductRepository   {
	
 
	
	public List<Product> getAll();
	
	public void save(Product product);
	
}
 
