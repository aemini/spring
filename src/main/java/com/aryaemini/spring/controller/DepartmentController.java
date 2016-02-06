package com.aryaemini.spring.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aryaemini.spring.service.DepartmentService;
import com.aryaemini.spring.model.Department;

@Controller
@RequestMapping("departments")
public class DepartmentController {

	private static final Logger logger = Logger.getLogger(DepartmentController.class);

	@Autowired
	DepartmentService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getIndex(ModelMap model) {
		
		logger.debug("UserController is executed");
		
		List<Department> departments = service.getAllDepartments();
		
		model.addAttribute("departments", departments);

		return "departments/index";
	}

}
