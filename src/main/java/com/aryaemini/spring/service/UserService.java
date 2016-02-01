package com.aryaemini.spring.service;

import java.util.List;
import com.aryaemini.spring.model.User;

public interface UserService {

	List<User> getAllUsers();
	
	User findById(int id);

}
