package com.ty.food.controller;


import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class DeleteUserById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		User user = userService.deleteUserById(1);
		if (user != null)
		{
			user=null;
		}
		else
		{
			System.out.println("user not found");
		}
	}
}
