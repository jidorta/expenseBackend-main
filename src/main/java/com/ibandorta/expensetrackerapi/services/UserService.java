package com.ibandorta.expensetrackerapi.services;

import com.ibandorta.expensetrackerapi.entity.User;
import com.ibandorta.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);

}
