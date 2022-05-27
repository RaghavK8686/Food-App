package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class GetUserById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService=new UserService();
		
		User user = userService.getUserById(1);
		if (user != null) {
			System.out.println("user id is" + user.getId());
			System.out.println("user name is:" + user.getName());
			System.out.println("user email is :" + user.getEmail());
			System.out.println("user phone is :" + user.getPhone());
			System.out.println("user password is :" + user.getPassword());
		} else {
			System.out.println("user doesn't exist");
		}
		

	}

}
