package com.ibandorta.expensetrackerapi.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibandorta.expensetrackerapi.entity.User;
import com.ibandorta.expensetrackerapi.entity.UserModel;
import com.ibandorta.expensetrackerapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(UserModel user) {
		User newUser = new User();
		BeanUtils.copyProperties(user, newUser);
		return userRepository.save(newUser);
	}

}
