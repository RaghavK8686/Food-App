package com.ty.food.service;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class UserService {

	UserDao userDao=new UserDao();
	
	public User saveUser(User user)
	{
		return userDao.saveUser(user);	
	}
	public User getUserById(int id)
	{
		return userDao.getUserById(id);
	}
	public User deleteUserById(int id)
	{
		return userDao.deleteUserById(id);
	}
	public User validateUser(String name ,String password)
	{
		return userDao.validateUser(name, password);
	}	
}
