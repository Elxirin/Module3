package com.capgemini.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.FirstDemo.Traingle;

public class MainAppCollection {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Traingle1 triangle1 = context.getBean("triangle1", Traingle1.class);
		triangle1.draw();
		
		/*Circle circle = context.getBean("circle", Circle.class);
		circle.draw();*/
		context.registerShutdownHook();
	
	}
}
