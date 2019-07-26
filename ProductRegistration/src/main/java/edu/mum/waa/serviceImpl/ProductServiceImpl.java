package edu.mum.waa.serviceImpl;

import java.util.List;

import edu.mum.waa.domain.Product;
import edu.mum.waa.repository.ProductRepository;
import edu.mum.waa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
  	public List<Product> getAll() {
		return productRepository.getAll();
	}
	
	public void save(Product product) {
		productRepository.save(product);
		return ;
	}
	
	
		   
}
 
