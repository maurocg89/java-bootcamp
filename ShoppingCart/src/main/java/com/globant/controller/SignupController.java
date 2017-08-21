package com.globant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.entity.User;
import com.globant.service.UserService;

@RestController
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.CREATED);
	}

	
	
}
