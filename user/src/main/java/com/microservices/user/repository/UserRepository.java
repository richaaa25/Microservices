package com.microservices.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{


	public User getById(int id);
	
	//public User findById(int id);
	
}
