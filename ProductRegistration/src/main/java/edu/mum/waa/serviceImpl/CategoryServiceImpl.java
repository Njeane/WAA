package edu.mum.waa.serviceImpl;

import java.util.List;

import edu.mum.waa.domain.Category;
import edu.mum.waa.repository.CategoryRepository;
import edu.mum.waa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
  	public List<Category> getAll() {
		return categoryRepository.getAll();
	}
	
	public Category getCategory(Integer id) {
		return categoryRepository.getCategory(id);
 	}
	
	
		   
}
 
