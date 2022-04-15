package com.careerit.sl.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingManager {

	public static void main(String[] args) {
//		Greetings obj = new Greetings();
//		obj.setMessage("Wish you happy Ugadi");
//		System.out.println(obj.getMessage());
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
//		Greetings obj = context.getBean(Greetings.class);
//		System.out.println(obj.getMessage());
//
//		ConnectionDetails connectiondetails = context.getBean(ConnectionDetails.class);
//		System.out.println(connectiondetails);
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml","greeting-spring.xml"});
		GreetingService greetingService= context.getBean(GreetingService.class);
		greetingService.showGreetings();
		
		
		
		 
	}
}
