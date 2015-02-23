package com.rynkowsw.project.service;

import java.util.Date;
import java.util.List;

import com.rynkowsw.project.domain.UserStatus;

public interface UserStatusService {

	public void createUserStatus(UserStatus userStatus);

	public void deleteUserStatus(UserStatus userStatus);

	public void updateUserStatus(UserStatus userStatus);

	public List<UserStatus> getUsersStatusFromDayToDay(Date t, Date t2, int id);

	public List<UserStatus> getAllUsersStatus(String login);

	public List<UserStatus> getUserStatusById(int id);
}
