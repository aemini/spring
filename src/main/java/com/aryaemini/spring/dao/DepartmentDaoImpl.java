package com.aryaemini.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import com.aryaemini.spring.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends AbstractDao<Integer, Department> implements DepartmentDao {

	public Department findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartments() {
		Criteria criteria = createEntityCriteria();
		return (List<Department>) criteria.list();
	}

}
