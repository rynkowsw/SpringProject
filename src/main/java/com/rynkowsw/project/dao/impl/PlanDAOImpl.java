package com.rynkowsw.project.dao.impl;

import java.util.Calendar;
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

import com.rynkowsw.inz.dao.PlanDAO;
import com.rynkowsw.inz.domain.Plan;

@Repository
public class PlanDAOImpl implements PlanDAO {

	@Autowired
	SessionFactory sf;

	@Transactional
	public List<Plan> getAllPlan() {
		return sf.openSession().createQuery("FROM Plan").list();
	}

	@Transactional
	public List<Plan> getPlanForUser(Integer userId) {
		Criteria cr = sf.openSession().createCriteria(Plan.class);
		cr.add(Restrictions.eq("userId", userId));
		return cr.list();
	}

	@Transactional
	public Plan getPlanById(Integer id) {
		Criteria cr = sf.openSession().createCriteria(Plan.class);
		cr.add(Restrictions.eq("planId", id));
		return (Plan) cr.uniqueResult();
	}

	@Transactional
	public void createPlan(Plan plan) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.save(plan);
		tr.commit();
	}

	@Transactional
	public void deletePlan(Plan plan) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.delete(plan);
		tr.commit();

	}

	@Transactional
	public List<Plan> getPlanForToday(Integer id, Calendar calendar) {
		Criteria cr = sf.openSession().createCriteria(Plan.class);
		cr.add(Restrictions.eq("user.userId", id));
		cr.add(Restrictions.le("start_work", calendar.getTime()) );
		cr.add(Restrictions.ge("finish_work", calendar.getTime()) );
		return cr.list();
	}

}
