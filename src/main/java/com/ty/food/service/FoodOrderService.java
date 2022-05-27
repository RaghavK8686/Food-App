package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.*;

public class FoodOrderService {
	FoodOrderDao dao = new FoodOrderDao();
	FoodOrder fodOrder=new FoodOrder();

	public FoodOrder saveOrder(FoodOrder foodOrder) {

		return dao.saveOrder(foodOrder);
	}

	public FoodOrder getFoodOrderById(int id) {

		return dao.getOrderById(id);
	}

	public FoodOrder deleteFood(int id) {

		return dao.deleteOrder(id);
	}

	public FoodOrder updateOrder(int id,FoodOrder foodOrder)
	{
		return dao.updateOrder(id, foodOrder);
	}
	
	public List<FoodOrder> getFoodOrderByName(String name)
	{
		return dao.getFoodOrderByName(name);
	}
	public List<FoodOrder> getFoodOrderByPhone(long phone)
	{
		return dao.getFoodOrderByPhone(phone);
		
	}
}
