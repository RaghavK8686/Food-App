package com.ty.food.controller;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class UpdateMenuController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Menu menu= new Menu();
//			menu.setId(6);
			menu.setName("PavBhaji");
			menu.setDescription("Most loved snack in India");
			menu.setOffer("50% off on weekends");
			menu.setType("veg");
			menu.setImage("https://media.istockphoto.com/photos/pav-bhaji-is-a-fast-food-dish-from-india-thick-and-spicy-vegetable-picture-"
					+ "id1152077771?b=1&k=20&m=1152077771&s=170667a&w=0&h=FZGza04C4whALYiXGnry4qMLB8X4Qrcc_IAYu4YJPYQ=");
			menu.setCost(20.00);
			
		MenuDao menuDao=new MenuDao();
		Menu res=menuDao.updateMenu(menu, 6);
		if(res!=null)
		{
			System.out.println("Updated menu");
		}
		else
		{
			System.out.println("not updated");
		}
	}

}
