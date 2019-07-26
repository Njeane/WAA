package edu.mum.waa.repository;

import java.util.List;

import edu.mum.waa.domain.User;

 public interface UserRepository   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
