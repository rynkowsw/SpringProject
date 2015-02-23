package com.rynkowsw.project.controller;

import java.util.List;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.rynkowsw.project.domain.Excercis;
import com.rynkowsw.project.domain.Plan;
import com.rynkowsw.project.domain.Training;
import com.rynkowsw.project.domain.User;
import com.rynkowsw.project.service.ExcercisService;
import com.rynkowsw.project.service.PlanService;
import com.rynkowsw.project.service.TrainingService;
import com.rynkowsw.project.service.UserService;

@Controller
public class ExerciseController {
	@Autowired
	ExcercisService excercisService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/getExcercis", method = RequestMethod.GET)
	public @ResponseBody String getExcercis(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "*");
		
		Gson gson= new Gson();

		List<Excercis> excercis = excercisService.getAllExcercises();
		logger.info("getExcercis");
		
		return gson.toJson(excercis);
	}
	
	@RequestMapping(value = "/addExercise", method = RequestMethod.POST)
	public @ResponseBody String saveCompany_JSON(@RequestBody Excercis exec,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "*");
		
		logger.info("addExercise");
		logger.info(exec.toString());
		
		excercisService.createExcercise(exec);
		Gson gson = new Gson();
		return gson.toJson("Ok");
	}
}
