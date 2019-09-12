package com.cg.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp2 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springConfig2.xml");
		context.registerShutdownHook();
		
		SBU2 sbu = context.getBean("sbu", SBU2.class);
		System.out.println(sbu);
	}
}
