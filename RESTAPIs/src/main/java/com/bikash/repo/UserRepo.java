package com.bikash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikash.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
