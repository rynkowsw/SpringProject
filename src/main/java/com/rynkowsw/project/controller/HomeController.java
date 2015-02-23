package com.rynkowsw.project.controller;

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

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	ExcercisService excercisService;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	private User user;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
	
		return "index";
	}
	
	

}
