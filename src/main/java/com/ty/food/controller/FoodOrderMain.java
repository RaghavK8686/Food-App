package com.ty.food.controller;

import java.util.ArrayList;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class FoodOrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setName("Sumeet");
		foodOrder.setPhone(741356321l);
		
		Item item1=new Item();
		item1.setName("Chicken nuggets");
		item1.setQuantity(8);
		item1.setCost(503.00);
		
		Item item2=new Item();
		item2.setName("Choco lava cake");
		item2.setQuantity(6);
		item2.setCost(600.00);
		
		List<Item> list=new ArrayList<Item>();
		list.add(item1);
		list.add(item2);
		
		foodOrder.setItem(list);
		item1.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		
		FoodOrderService foodOrderService=new FoodOrderService();
		foodOrderService.saveOrder(foodOrder);
		
		
	}

}
