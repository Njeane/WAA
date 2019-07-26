package edu.mum.waa.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import edu.mum.waa.domain.Product;
import edu.mum.waa.repository.ProductRepository;
import org.springframework.stereotype.Repository;



@Repository
 public class ProductRepositoryImpl implements ProductRepository {
	
		private List<Product> listOfProducts = new ArrayList<Product>();

  	
		 
		public List<Product> getAll() {
		return listOfProducts;
	}
	
	 
	public void save(Product product) {
		listOfProducts.add(product);
		return ;
	}
	
 
		   
}
 
