package com.cg.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp1 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springConfig1.xml");
		context.registerShutdownHook();
		
		Employee1 emp = context.getBean("employee1", Employee1.class);
		System.out.println(emp);
	}
}
