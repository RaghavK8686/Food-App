package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class ValidateUserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService useService=new UserService();
		User user=useService.validateUser("Deepesh", "deepesh@123");
		if(user!=null)
		{
			System.out.println("user name and password are valid");
		}
		else
		{
			System.out.println("user not found");
		}
	}

}
