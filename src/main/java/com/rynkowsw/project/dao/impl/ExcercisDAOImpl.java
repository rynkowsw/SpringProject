package com.rynkowsw.project.dao.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rynkowsw.project.dao.ExcercisDAO;
import com.rynkowsw.project.domain.Excercis;

@Repository
public class ExcercisDAOImpl implements ExcercisDAO {

	@Autowired
	SessionFactory sf;

	@Transactional
	public List<Excercis> getAllExcercises() {
		return sf.openSession().createQuery("FROM Excercis").list();
	}

	@Transactional
	public void createExcercise(Excercis exec) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		ses.save(exec);
		tr.commit();
	}

	@Transactional
	public void deleteExcercise(Excercis exec) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		ses.delete(exec);
		tr.commit();
	}

	@Transactional
	public void updateExcercise(Excercis exec) {
		Session ses = sf.openSession();
		Transaction tr = ses.getTransaction();
		ses.update(exec);
		tr.commit();

	}

	@Transactional
	public Excercis getExcercisById(Integer id) {
		Criteria crit = sf.openSession().createCriteria(Excercis.class);
		crit.add(Restrictions.eq("excerciseId", id));
		return (Excercis) crit.uniqueResult();
	}

	@Transactional
	public Map<Integer, String> getAllMappedExcercises() {
			Criteria cr = sf.openSession().createCriteria(Excercis.class);
			cr.addOrder(Order.asc("name"));

			List<Excercis> excercises = cr.list();
			Iterator<Excercis> iter = excercises.iterator();
			Map<Integer, String> mappedExcercises = new LinkedHashMap<Integer, String>();

			while (iter.hasNext()) {
				Excercis exec = iter.next();
				mappedExcercises.put(exec.getExcerciseId(),exec.getName());
			}
			return mappedExcercises;
		}
	
}
