package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class DeleteFoodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrderService foodOrderService=new FoodOrderService();
		FoodOrder foodOrder=foodOrderService.deleteFood(2);
		if(foodOrder!=null)
		{
			foodOrder=null;
		}
		else
		{
			System.out.println("invalid id");
		}
		
	}

}
