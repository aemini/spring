package com.aryaemini.spring.service;

import java.util.List;
import com.aryaemini.spring.model.Department;

public interface DepartmentService {

	List<Department> getAllDepartments();
	
	Department findById(int id);

}
