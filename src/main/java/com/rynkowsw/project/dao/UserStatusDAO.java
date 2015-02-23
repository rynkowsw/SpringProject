package com.rynkowsw.project.dao;

import java.util.Date;
import java.util.List;

import com.rynkowsw.project.domain.User;
import com.rynkowsw.project.domain.UserStatus;

public interface UserStatusDAO {
	void createUserStatus(UserStatus u);

	void updateUserStatus(UserStatus p);

	void removeUserStatus(UserStatus p);

	List<UserStatus> getUserStatusById(int id);

	List<UserStatus> getUserStatusByDaytoDay(Date t, Date t1, int id);

}
