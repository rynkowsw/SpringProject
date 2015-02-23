package com.rynkowsw.project.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rynkowsw.project.dao.UserDAO;
import com.rynkowsw.project.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sf;

	@Transactional
	public User getUserById(Integer id) {
		Criteria cr = sf.openSession().createCriteria(User.class);
		cr.add(Restrictions.eq("userId", id));
		return (User) cr.uniqueResult();
	}

	@Transactional
	public List<User> getAllUsers() {
		return sf.openSession().createQuery("from User").list();
	}

	@Transactional
	public void createUser(User user) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.save(user);
		tr.commit();
	}

	@Transactional
	public void deleteUser(User user) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.delete(user);
		tr.commit();
	}

	@Transactional
	public void updateUser(User user) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.update(user);
		tr.commit();
	}

	@Override
	public User getUserByLogin(String login) {
		Criteria cr = sf.openSession().createCriteria(User.class);
		cr.add(Restrictions.eq("login", login));
		return (User) cr.uniqueResult();
	}

}
