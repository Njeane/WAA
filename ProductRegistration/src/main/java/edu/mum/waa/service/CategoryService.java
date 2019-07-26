package edu.mum.waa.service;

import edu.mum.waa.domain.Category;

import java.util.List;


 public interface CategoryService  {
	
 
		public Category getCategory(Integer id);
		
		public List<Category> getAll();
		   
	
}
 
