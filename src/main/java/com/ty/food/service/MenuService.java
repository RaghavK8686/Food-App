package com.ty.food.service;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;

public class MenuService {

	MenuDao menuDao=new MenuDao();
	//Menu menu=new Menu();
	
	public Menu saveMenu(Menu menu)
	{
		return menuDao.saveMenu(menu);
	}
	public Menu getMenu(int id)
	{
		return menuDao.getMenu(id);
	}
	public Menu deleteMenu(int id)
	{
		return menuDao.deleteMenu(id);
	}
	public Menu updateMenu(Menu menu,int id)
	{
		return menuDao.updateMenu(menu,id);
	}
}
