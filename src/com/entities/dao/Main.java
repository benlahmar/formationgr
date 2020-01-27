package com.entities.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Account;
import com.entities.Profile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Appcontext.xml");
		AccountManager cm=(AccountManager) ctx.getBean("adao");
		Account a=new Account();
		ProfileManager pm=(ProfileManager) ctx.getBean("pdao");
		
		Profile p=new Profile();
		p.setNom("aziz");
		
		pm.store(p);
		
		a.setLogin("xyz");
		a.setProfile(p);
		cm.store(a);
		
		
		//fin

	}

}
