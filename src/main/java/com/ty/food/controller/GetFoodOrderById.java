package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class GetFoodOrderById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrderService foodOrderService = new FoodOrderService();
		FoodOrder foodOrder = foodOrderService.getFoodOrderById(2);

		System.out.println("The user name is:" + foodOrder.getName());
		System.out.println("The user phone number is:" + foodOrder.getPhone());
		System.out.println("The user id is :" + foodOrder.getId());
		List<Item> list = foodOrder.getItem();
		for (Item item : list) {
			System.out.println("item id is:" + item.getId());
			System.out.println("item name is :" + item.getName());
			System.out.println("item quantity is:" + item.getQuantity());
		}
	}

}
