package com.rynkowsw.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rynkowsw.project.dao.TrainingDAO;
import com.rynkowsw.project.domain.Training;
import com.rynkowsw.project.service.TrainingService;

@Service
public class TrainingServicecImpl implements TrainingService {

	@Autowired
	TrainingDAO trainingDao;

	@Transactional
	public List<Training> getTrainingForPlanId(Integer planId) {
		return trainingDao.getTrainingForPlanId(planId);
	}

	@Transactional
	public List<Training> getTrainingByExcerciseId(Integer excerciseId) {
		return trainingDao.getTrainingByExcerciseId(excerciseId);
	}

	@Transactional
	public void createTraining(Training training) {
		trainingDao.createTraining(training);
	}

	@Transactional
	public void updateTraining(Training training) {
		trainingDao.updateTraining(training);
	}

	@Transactional
	public void deleteTraining(Training training) {
		trainingDao.deleteTraining(training);
	}

}
