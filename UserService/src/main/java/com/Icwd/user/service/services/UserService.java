package com.Icwd.user.service.services;

import java.util.List;

import com.Icwd.user.service.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	

}
