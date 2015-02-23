package com.rynkowsw.project.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rynkowsw.project.dao.UserDAO;
import com.rynkowsw.project.dao.UserStatusDAO;
import com.rynkowsw.project.domain.UserStatus;
import com.rynkowsw.project.service.UserStatusService;

public class UserStatusServiceImpl implements UserStatusService {

	@Autowired
	UserStatusDAO userStatusDao;
	@Autowired
	UserDAO userDao;

	@Override
	public List<UserStatus> getUserStatusById(int id) {

		return userStatusDao.getUserStatusById(id);
	}

	@Override
	public List<UserStatus> getAllUsersStatus(String login) {
		int id = userDao.getUserByLogin(login).getUserId();
		return userStatusDao.getUserStatusById(id);
	}

	@Override
	public void createUserStatus(UserStatus userStatus) {
		userStatusDao.createUserStatus(userStatus);

	}

	@Override
	public void deleteUserStatus(UserStatus userStatus) {
		userStatusDao.removeUserStatus(userStatus);

	}

	@Override
	public void updateUserStatus(UserStatus userStatus) {
		userStatusDao.updateUserStatus(userStatus);

	}

	@Override
	public List<UserStatus> getUsersStatusFromDayToDay(Date t, Date t2, int id) {
		return userStatusDao.getUserStatusByDaytoDay(t, t2, id);
	}

}
