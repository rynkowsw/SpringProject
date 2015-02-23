package com.rynkowsw.project.dao;

import java.util.List;

import com.rynkowsw.project.domain.User;

public interface UserDAO {

	public User getUserById(Integer id);

	public User getUserByLogin(String login);

	public List<User> getAllUsers();

	public void createUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);
}
