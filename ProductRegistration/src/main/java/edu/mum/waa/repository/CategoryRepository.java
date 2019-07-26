package edu.mum.waa.repository;

import edu.mum.waa.domain.Category;

import java.util.List;


 public interface CategoryRepository   {
	
 
		public Category getCategory(int id);
		
		public List<Category> getAll();
		   
	
}
 
