package edu.mum.waa.service;

import java.util.List;

import edu.mum.waa.domain.User;

 

 public interface UserService   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
