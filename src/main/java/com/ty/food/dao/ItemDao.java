package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Item;

public class ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(Item item)
	{
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
		
	}
	public int getItemById(int id)
	{
		Item item=entityManager.find(Item.class,1);
		if(item!=null)
		{
			System.out.println("Item id is:"+item.getId());
			System.out.println("Item name is :"+item.getName());
			System.out.println("Item Quantity is :"+item.getQuantity());
			System.out.println("Item cost is:"+item.getCost());
		}
		else
		{
			System.out.println();
		}
		return 0;
		
		
	}
	public void deleteItem()
	{
		
	}
	public void updateItem()
	{
		
	}
}
