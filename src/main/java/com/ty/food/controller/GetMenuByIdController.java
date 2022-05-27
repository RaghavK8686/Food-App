package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class GetMenuByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuService menuService = new MenuService();
		Menu menu=menuService.getMenu(4);
		if (menu != null) {
			System.out.println("menu id is : " + menu.getId());
			System.out.println("menu name is : " + menu.getName());
			System.out.println("Description is : " + menu.getDescription());
			System.out.println("OfferPercent is:" + menu.getOffer());
			System.out.println("Type is :" + menu.getType());
			System.out.println("image is :" + menu.getImage());
		}

	}

}
