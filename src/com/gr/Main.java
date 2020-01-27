/**
 * 
 */
package com.gr;

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

		ApplicationContext ctx=new ClassPathXmlApplicationContext("Appcontext.xml");
		Personne p=(Personne) ctx.getBean("personne");
		p.affiche();
		System.out.println(p.getNom());
	}

}
