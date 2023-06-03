package spring_2_controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_2_dto.Item;
import spring_2_dto.Menu;

public class Controller {
	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("demo.xml");
//		Item item = (Item) beanFactory.getBean("item");
		Menu menu = (Menu) beanFactory.getBean("menu");
//		System.out.println(item.getName());
//		System.out.println(item.getPrice());
		System.out.println(menu.getMenuName());
		System.out.println(menu.getMenuType());
		System.out.println(menu.getItem().getName());
		System.out.println(menu.getItem().getPrice());

	}

}
