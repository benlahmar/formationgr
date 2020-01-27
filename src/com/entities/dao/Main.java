package com.entities.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Account;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Appcontext.xml");
		AccountManager cm=(AccountManager) ctx.getBean("adao");
		Account a=new Account();
		a.setLogin("admin");
		a.setPassword("admin");
		a.setRole("admin");
		cm.store(a);
		//fin

	}

}
