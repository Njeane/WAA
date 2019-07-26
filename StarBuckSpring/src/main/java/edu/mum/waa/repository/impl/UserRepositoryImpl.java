package edu.mum.waa.repository.impl;

import java.util.List;

import edu.mum.waa.data.Database;
import edu.mum.waa.domain.User;
import edu.mum.waa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 
@Repository
 public class UserRepositoryImpl implements UserRepository {

	@Autowired
	Database data;
 
	@Override
	public List<User> getAll() {
		return (List<User>) data.users.values();
	}
	
 
	@Override
	public User findByName(String name) {
		User user = data.users.get(name);
		
		return user;
	}
	
	
		   
}
 
