package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Menu;

public class MenuDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Menu saveMenu(Menu menu) {
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}

	public Menu getMenu(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		return menu;

	}

	public Menu deleteMenu(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		entityTransaction.begin();
		entityManager.remove(menu);
		entityTransaction.commit();
		return menu;
	}

	public Menu updateMenu(Menu menu,int id) {
		Menu menu1 = entityManager.find(Menu.class, id);
		menu1.setName(menu.getName());
		menu1.setCost(menu.getCost());
		
		entityTransaction.begin();
		entityManager.merge(menu1);
		entityTransaction.commit();
		return menu1;
	}
}
