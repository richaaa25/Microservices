package com.microservices.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.model.User;
import com.microservices.user.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserRepository userRepository;
	
	 @GetMapping("/{userId}")
	    private User getUserByUserId( @PathVariable ("userId") String userId) {
		 int id = Integer.parseInt(userId);
		 	User user = userRepository.getById(id);
			if (null != user) {
				//log
			} else {
				user = new User();
				//log
			}
		    return user;
	 }

}
