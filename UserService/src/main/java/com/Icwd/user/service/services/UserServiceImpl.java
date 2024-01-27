package com.Icwd.user.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.Icwd.user.service.entity.User;
import com.Icwd.user.service.exception.ResourceNotFoundException;
import com.Icwd.user.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository; 
	
	public User saveUser(User user) {

		String userID = UUID.randomUUID().toString();
		user.setUserId(userID);
		return userRepository.save(user);
	}

	public List<User> getAllUser() {

		
		return userRepository.findAll();
	}

	public User getUser(String userId) {

		
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found with given id : "+userId));
	}

}
