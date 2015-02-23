package com.rynkowsw.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rynkowsw.project.dao.UserDAO;
import com.rynkowsw.project.domain.User;
import com.rynkowsw.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

}
