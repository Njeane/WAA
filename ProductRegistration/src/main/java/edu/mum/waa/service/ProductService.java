package edu.mum.waa.service;

import edu.mum.waa.domain.Product;

import java.util.List;


 public interface ProductService   {
	
	public List<Product> getAll();
	
	public void save(Product product);
	
	
		   
}
 
