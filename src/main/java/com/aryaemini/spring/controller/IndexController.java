package com.aryaemini.spring.controller;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aryaemini.spring.service.IndexService;

@Controller
@RequestMapping("/")
public class IndexController {

	private static final Logger logger = Logger.getLogger(IndexController.class);

	@Autowired
	IndexService indexSvc;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLanding(ModelMap model) {
		
		logger.debug("IndexController is executed");
		
		String foo = indexSvc.getAttributes();
		
		model.addAttribute("foo", foo);
		model.addAttribute("bar", "falan");
		model.addAttribute("baz", "long");

		return "index";
	}

}
