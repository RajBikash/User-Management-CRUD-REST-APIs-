package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikash.model.User;
import com.bikash.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User Added Sucessfully...";
		 
	}
	@GetMapping
	public List<User>getAllUsers(){
		return userService.getAllUsers();
		
	}
	
	@GetMapping("/{id}" )
	public User getUser(@PathVariable Integer id) {
		return userService.getUser(id);
		
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		return userService.updateUser(id,user);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "user deleted sucess";
		
	}
	

}
