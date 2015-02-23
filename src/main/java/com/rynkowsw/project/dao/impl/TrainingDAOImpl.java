package com.rynkowsw.project.dao.impl;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rynkowsw.project.dao.TrainingDAO;
import com.rynkowsw.project.domain.Plan;
import com.rynkowsw.project.domain.Training;

@Repository
public class TrainingDAOImpl implements TrainingDAO {

	@Autowired
	SessionFactory sf;

	@Transactional
	public List<Training> getTrainingForPlanId(Integer planId) {
		Criteria cr = sf.openSession().createCriteria(Training.class);
		cr.add(Restrictions.eq("plan.planId", planId));
		cr.addOrder(Order.asc("trainingId"));
		return cr.list();
	}

	@Transactional
	public List<Training> getTrainingByExcerciseId(Integer excerciseId) {
		Criteria cr = sf.openSession().createCriteria(Training.class);
		cr.add(Restrictions.eq("excerciseId", excerciseId));
		return cr.list();
	}

	@Transactional
	public void createTraining(Training training) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.save(training);
		tr.commit();

	}

	@Transactional
	public void updateTraining(Training training) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.update(training);
		tr.commit();

	}

	@Transactional
	public void deleteTraining(Training training) {
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();
		ses.delete(training);
		tr.commit();

	}

	@Transactional
	public List<Training> getAllTraining() {
		return sf.openSession().createQuery("from Training").list();
	}
	
	@Transactional
	public List<Training> getTrainingForDay(String day) {
		Criteria cr = sf.openSession().createCriteria(Training.class);
		cr.add(Restrictions.eq("day", day));
		return cr.list();
	}
	
	
}
