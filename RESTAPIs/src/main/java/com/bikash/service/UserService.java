package com.bikash.service;

import java.util.List;

import com.bikash.model.User;

public interface UserService {

	void addUser(User user);

	List<User> getAllUsers();

	User getUser(Integer id);

	User updateUser(Integer id, User user);

	void deleteUser(Integer id);

	

}
