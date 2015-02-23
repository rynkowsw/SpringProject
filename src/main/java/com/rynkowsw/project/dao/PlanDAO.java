package com.rynkowsw.project.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.rynkowsw.project.domain.Plan;

public interface PlanDAO {

	public List<Plan> getAllPlan();

	public List<Plan> getPlanForUser(Integer userId);

	public Plan getPlanById(Integer id);

	public void createPlan(Plan plan);

	public void deletePlan(Plan plan);

	public List<Plan> getPlanForToday(Integer id, Calendar calendar);
}
