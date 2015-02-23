package com.rynkowsw.project.service;

import java.util.List;
import java.util.Map;

import com.rynkowsw.project.domain.Excercis;

public interface ExcercisService {
	public List<Excercis> getAllExcercises();

	public void createExcercise(Excercis exec);

	public void deleteExcercise(Excercis exec);

	public void updateExcercise(Excercis exec);

	public Excercis getExcercisById(Integer id);

	public Map<Integer, String> getAllMappedExcercises();
}
