package com.spring.rest.service;

import java.util.List;

import com.spring.rest.model.User;

/**
 * Created by USER on 29-09-2016.
 */
public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
