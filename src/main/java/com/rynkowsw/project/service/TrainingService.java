package com.rynkowsw.project.service;

import java.util.List;

import com.rynkowsw.project.domain.Training;

public interface TrainingService {
	public List<Training> getTrainingForPlanId(Integer planId);

	public List<Training> getTrainingByExcerciseId(Integer excerciseId);

	public void createTraining(Training training);

	public void updateTraining(Training training);

	public void deleteTraining(Training training);
}
