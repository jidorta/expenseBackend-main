package com.ibandorta.expensetrackerapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibandorta.expensetrackerapi.entity.User;
import com.ibandorta.expensetrackerapi.entity.UserModel;
import com.ibandorta.expensetrackerapi.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User>save(@RequestBody UserModel user){
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}

}
