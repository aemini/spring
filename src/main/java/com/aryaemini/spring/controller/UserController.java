package com.aryaemini.spring.controller;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aryaemini.spring.service.IndexService;

@Controller
@RequestMapping("users")
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	IndexService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getIndex(ModelMap model) {
		
		logger.debug("UserController is executed");
		
		String foo = service.getAttributes();
		
		model.addAttribute("foo", foo);
		model.addAttribute("bar", "falan");
		model.addAttribute("baz", "long");

		return "users/index";
	}

}
