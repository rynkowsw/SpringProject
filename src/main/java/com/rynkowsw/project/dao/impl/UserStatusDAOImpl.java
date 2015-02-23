package com.rynkowsw.project.dao.impl;

import java.util.Date;
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
import com.rynkowsw.project.dao.UserStatusDAO;
import com.rynkowsw.project.domain.User;
import com.rynkowsw.project.domain.UserStatus;
import com.rynkowsw.project.service.UserService;

@Repository
public class UserStatusDAOImpl implements UserStatusDAO {

	@Autowired
	private SessionFactory sf;

	@Override
	@Transactional
	public void createUserStatus(UserStatus u) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		ses.save(u);
		tr.commit();
		ses.close();
	}

	@Override
	@Transactional
	public void updateUserStatus(UserStatus u) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		ses.update(u);
		tr.commit();
		ses.close();
	}

	@Override
	@Transactional
	public void removeUserStatus(UserStatus u) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		ses.delete(u);
		tr.commit();
		ses.close();
	}


	@Override
	public List<UserStatus> getUserStatusByDaytoDay(Date t, Date t1, int id) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		Criteria cr = sf.openSession().createCriteria(UserStatus.class);
		cr.add(Restrictions.between("date", t, t1));
		cr.add(Restrictions.eq("userId", id));
		return (List<UserStatus>) cr.uniqueResult();
	}

	@Override
	public List<UserStatus> getUserStatusById(int id) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		Criteria cr = sf.openSession().createCriteria(UserStatus.class);
		cr.add(Restrictions.eq("userId", id));
		return (List<UserStatus>) cr.uniqueResult();
	}

}
