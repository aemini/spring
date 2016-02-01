package com.aryaemini.spring.dao;

import java.util.List;
import com.aryaemini.spring.model.User;

public interface UserDao {

	List<User> getAllUsers();
	
	User findById(int id);

}
