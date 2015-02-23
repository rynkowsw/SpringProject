package com.rynkowsw.project.dao;

import java.util.List;
import java.util.Map;

import com.rynkowsw.project.domain.Excercis;

public interface ExcercisDAO {
	public List<Excercis> getAllExcercises();

	public void createExcercise(Excercis exec);

	public void deleteExcercise(Excercis exec);

	public void updateExcercise(Excercis exec);

	public Excercis getExcercisById(Integer id);

	public Map<Integer, String> getAllMappedExcercises();
}
