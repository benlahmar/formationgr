/**
 * 
 */
package com.moi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext app=new ClassPathXmlApplicationContext("Beans.xml");
			Produit p=(Produit) app.getBean("produit");
			System.out.println(p.getPrix());
		
		
	}

}
