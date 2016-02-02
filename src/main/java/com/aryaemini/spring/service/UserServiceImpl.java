package com.aryaemini.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aryaemini.spring.dao.UserDao;
import com.aryaemini.spring.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	public User findById(int id) {
		return dao.findById(id);
	}

}
