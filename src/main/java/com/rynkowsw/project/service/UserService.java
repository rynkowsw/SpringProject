package com.rynkowsw.project.service;

import java.util.List;

import com.rynkowsw.project.domain.User;

public interface UserService {
	public User getUserById(Integer id);

	public List<User> getAllUsers();

	public void createUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);
}
