package com.rynkowsw.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rynkowsw.project.dao.ExcercisDAO;
import com.rynkowsw.project.domain.Excercis;
import com.rynkowsw.project.service.ExcercisService;

@Service
public class ExcerciseServiceImpl implements ExcercisService {

	@Autowired
	ExcercisDAO excercise;

	@Override
	public List<Excercis> getAllExcercises() {
		return excercise.getAllExcercises();
	}

	@Override
	public void createExcercise(Excercis exec) {
		excercise.createExcercise(exec);
	}

	@Override
	public void deleteExcercise(Excercis exec) {
		excercise.deleteExcercise(exec);
	}

	@Override
	public void updateExcercise(Excercis exec) {
		excercise.updateExcercise(exec);
	}

	@Override
	public Excercis getExcercisById(Integer id) {
		return excercise.getExcercisById(id);
	}

	@Override
	public Map<Integer, String> getAllMappedExcercises() {
		return excercise.getAllMappedExcercises();
	}

}
