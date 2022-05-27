package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class GetFoodByPhone {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrder foodOrder = new FoodOrder();
		System.out.println("food id is"+foodOrder.getId());
		System.out.println("name is :"+foodOrder.getName());
		System.out.println("total is :"+foodOrder.getTotal());
		
		FoodOrderService foodOrderService=new FoodOrderService();
		foodOrderService.getFoodOrderByPhone(741356321);
		}
}
