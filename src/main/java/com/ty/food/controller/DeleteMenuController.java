package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class DeleteMenuController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu=new Menu();
		if(menu!=null)
		{
			menu=null;
		}
		MenuService menuService=new MenuService();
		menuService.deleteMenu(5);
	}

}
