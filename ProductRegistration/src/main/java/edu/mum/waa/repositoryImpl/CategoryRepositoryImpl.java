package edu.mum.waa.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import edu.mum.waa.domain.Category;
import edu.mum.waa.repository.CategoryRepository;
import org.springframework.stereotype.Repository;



@Repository
 public class CategoryRepositoryImpl implements CategoryRepository {
	
 	    private List<Category> categories;
 	    
	    public CategoryRepositoryImpl() {
	        categories = new ArrayList<Category>();
	        Category computerCategory = new Category(1, "Computer");
	        Category sportsCategory = new Category(2, "Sports");
	        Category foodCategory = new Category(3, "Food");
	        categories.add(computerCategory);
	        categories.add(sportsCategory);
	        categories.add(foodCategory);
	    }
		
     public List<Category> getAll() {
        return categories;
    }
    
    public Category getCategory(int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }

		   
}
 
