package com.rynkowsw.project.dao;

import java.util.List;

import com.rynkowsw.project.domain.Training;

public interface TrainingDAO {

	public List<Training> getTrainingForPlanId(Integer planId);

	public List<Training> getTrainingForDay(String day);
	
	public List<Training> getTrainingByExcerciseId(Integer excerciseId);

	public void createTraining(Training training);

	public void updateTraining(Training training);

	public void deleteTraining(Training training);

	public List<Training> getAllTraining();
}
