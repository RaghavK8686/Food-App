package com.ty.food.controller;

import com.ty.food.service.MenuService;
import com.ty.food.dto.Menu;

public class SaveMenuController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu =new Menu();
		menu.setName("French-Fries");
		menu.setDescription("French-Fries never goes out of style");
		menu.setCost(300.00);
		menu.setOffer("40%");
		menu.setType("veg");
		menu.setImage("https://cdn.pixabay.com/photo/2016/11/20/09/06/bowl-1842294__340.jpg");
		
		MenuService menuService=new MenuService();
		menuService.saveMenu(menu);
		
	}

}
