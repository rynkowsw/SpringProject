package com.rynkowsw.project.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rynkowsw.project.dao.PlanDAO;
import com.rynkowsw.project.domain.Plan;
import com.rynkowsw.project.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	PlanDAO planDao;

	@Override
	public List<Plan> getAllPlan() {
		return planDao.getAllPlan();
	}

	@Override
	public List<Plan> getPlanForUser(Integer userId) {
		return planDao.getPlanForUser(userId);
	}

	@Override
	public Plan getPlanById(Integer id) {
		return planDao.getPlanById(id);
	}

	@Override
	public void createPlan(Plan plan) {
		planDao.createPlan(plan);
	}

	@Override
	public void deletePlan(Plan plan) {
		planDao.deletePlan(plan);
	}

	@Override
	public List<Plan> getPlanForToday(Integer id, Calendar calendar) {
		return planDao.getPlanForToday(id, calendar);
	}

}
