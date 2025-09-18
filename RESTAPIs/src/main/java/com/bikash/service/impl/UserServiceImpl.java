package com.bikash.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikash.model.User;
import com.bikash.repo.UserRepo;
import com.bikash.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public User getUser(Integer id) {
	
		return userRepo.findById(id)
				.orElseThrow(()->new RuntimeException("user not found " + id ));
	}

	@Override
	public User updateUser(Integer id, User user) {
		User user2=getUser(id);
		user2.setName(user.getName());
		user2.setAge(user.getAge());
		user2.setAddress(user.getAddress());
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}
	
	


}
