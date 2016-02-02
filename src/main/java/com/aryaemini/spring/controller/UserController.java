package com.aryaemini.spring.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aryaemini.spring.service.UserService;
import com.aryaemini.spring.model.User;

@Controller
@RequestMapping("users")
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	UserService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getIndex(ModelMap model) {
		
		logger.debug("UserController is executed");
		
		List<User> users = service.getAllUsers();
		
		model.addAttribute("users", users);

		return "users/index";
	}

}
