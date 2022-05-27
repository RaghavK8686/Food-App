package com.ty.food.service;

import com.ty.food.dao.ItemDao;
import com.ty.food.dto.Item;

public class ItemService {

	ItemDao itemDao=new ItemDao();
	Item item=new Item();
	
	public Item saveItem(Item item)
	{
		return itemDao.saveItem(item);
	}
	public Item getItemById(int id)
	{
		return item;
		
	}
}
