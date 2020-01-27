package com.moi.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moi.Categorie;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");
		CategorieManager cm=(CategorieManager) context.getBean("catmanager");
		Categorie c=new Categorie();
		c.setLibelle("hard");
		cm.Store(c);

	}

}
