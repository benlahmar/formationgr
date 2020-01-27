/**
 * 
 */
package com.moi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author moi
 *
 */

@Configuration
@ComponentScan
public class Main2 {

	@Bean
	IFiliere ifliere() {
		return new IFiliere() {
			
			@Override
			public String display() {
				// TODO Auto-generated method stub
				return "test ioc";
			}
		};
	} 
	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(
	        Main2.class);
	    Personnel pers = context.getBean(Personnel.class);
	    pers.affiche();
	    
	}
}
