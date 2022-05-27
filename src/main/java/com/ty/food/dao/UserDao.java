package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User getUserById(int id) {

		User user = entityManager.find(User.class, 1);

		return user;
	}

	public User deleteUserById(int id) {

		User user = entityManager.find(User.class, 1);
		
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();

		
		return user;
	}

	public User validateUser(String name, String password) {

		String sql = "select user from User user where user.name =?1 and user.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, password);

		List<User> list = query.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		} else {
			System.out.println("invalid name and password");
		}
		return null;
	
	}
}
