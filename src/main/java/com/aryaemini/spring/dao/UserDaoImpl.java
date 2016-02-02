package com.aryaemini.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import com.aryaemini.spring.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

}
