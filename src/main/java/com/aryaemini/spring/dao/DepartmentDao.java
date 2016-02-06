package com.aryaemini.spring.dao;

import java.util.List;
import com.aryaemini.spring.model.Department;

public interface DepartmentDao {

	List<Department> getAllDepartments();
	
	Department findById(int id);

}
