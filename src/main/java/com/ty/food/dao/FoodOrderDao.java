package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder saveOrder(FoodOrder foodOrder) {

		entityTransaction.begin();
		for (Item item : foodOrder.getItem()) {
			entityManager.persist(item);
		}
		entityManager.persist(foodOrder);
		entityTransaction.commit();
//		return entityManager.find(FoodOrder.class, foodOrder.getId());
		return foodOrder;
	}

	public FoodOrder getOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		if (foodOrder != null)
			return foodOrder;
		return null;
	}

	public FoodOrder deleteOrder(int id) {

		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		if (foodOrder != null) {
			entityManager.remove(foodOrder);
			entityTransaction.commit();
		}

		else {
			return foodOrder;
		}
		return null;
	}

	public FoodOrder updateOrder(int id, FoodOrder foodOrder) {

		FoodOrder foodOrder1 = entityManager.find(FoodOrder.class, id);
		foodOrder1.setName(foodOrder.getName());
		foodOrder1.setPhone(foodOrder.getPhone());

		entityTransaction.begin();
		entityManager.merge(foodOrder1);
		entityTransaction.commit();
		return foodOrder1;

	}

	public List<FoodOrder> getFoodOrderByName(String name) {
		String sql="select foodorder from FoodOrder foodorder where foodorder.name=?1";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<FoodOrder> lists=query.getResultList();
		if(lists!=null)
		{
			return lists;
		}
		else return null;
	}
	
	public List<FoodOrder> getFoodOrderByPhone(long phone)
	{
		String sql="select foodorder from FoodOrder foodorder where foodorder.phone=?1";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, phone);
		List<FoodOrder> list=query.getResultList();
		if(list != null)
		{
			return list;
		}
		else return null;
		
	}

}










