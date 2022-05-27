package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class UpdateFoodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setName("Magie");
		foodOrder.setPhone(987412356l);
		foodOrder.setTotal(1500);
		
		Item item1=new Item();
		item1.setName("Tandoori");
		item1.setCost(1500);
		item1.setQuantity(01);
		
		Item item2=new Item();
		item2.setName("Cake");
		item2.setCost(500);
		item2.setQuantity(3);
		
		
	    
	 
	}

}
