package edu.mum.waa.service.impl;

import java.util.List;

import edu.mum.waa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.domain.User;
import edu.mum.waa.service.UserService;

 
@Service
 public class UserServiceImpl implements UserService  {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.getAll();
	}
	
	public User findByName(String name) {
		return userRepository.findByName(name);
	}
	
	
		   
}
 
