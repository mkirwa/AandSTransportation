package com.mahlon.dao;

import java.util.List;

import com.mahlon.model.User;

public interface UserDao {

	public List listAllUsers();
	 
	 public void addUser(User user);
	 
	 public void updateUser(User user);
	 
	 public void deleteUser(int id);
	 
	 public User findUserById(int id);
}