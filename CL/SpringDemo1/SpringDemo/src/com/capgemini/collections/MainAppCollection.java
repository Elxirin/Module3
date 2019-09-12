package com.capgemini.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.FirstDemo.Traingle;

public class MainAppCollection {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		/*Traingle1 triangle1 = context.getBean("triangle1", Traingle1.class);
		triangle1.draw();*/
		
		/*Circle circle = context.getBean("circle", Circle.class);
		circle.draw();*/
		context.registerShutdownHook();
	
		/*Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.getDob());*/
		
		/*Circle circle = context.getBean("circle", Circle.class);
		circle.draw();*/
		
		AbstractApplicationContext cntxt = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Customer cust1 = cntxt.getBean("customer", Customer.class);
		Customer cust2 = cntxt.getBean("cust", Customer.class);
		System.out.println(cust1);
		System.out.println(cust2);
		
		Circle c = cntxt.getBean("circle", Circle.class);
		c.draw();
		
		
	}
}
