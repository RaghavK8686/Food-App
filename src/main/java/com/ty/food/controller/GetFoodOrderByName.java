package com.ty.food.controller;

import java.util.List;
import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class GetFoodOrderByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrderService foodOrderService=new FoodOrderService();
			List<FoodOrder> list = foodOrderService.getFoodOrderByName("surazz");
			for(FoodOrder food:list)
			{
				System.out.println("food id is :"+food.getId());
				System.out.println("name is :"+food.getName());
				System.out.println("phone is :"+food.getPhone());
				System.out.println("Total is :"+food.getTotal());
				}
			}
}
