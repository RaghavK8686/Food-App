package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class SaveUserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("Deepesh");
		user.setEmail("deepesh@gmail.com");
		user.setPassword("deepesh@123");
		user.setPhone(98746321l);
		
		UserService userService=new UserService();
		userService.saveUser(user);
	}

}
