package edu.mum.waa.repository;

import edu.mum.waa.domain.User;

import java.util.List;

 public interface UserRepository   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
