package com.capgemini.FirstDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainApp {
	public static void main(String[] args) {
		
		/*Traingle t = new Traingle();
		t.draw();*/ //Normal Way
		
		/*BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("SpringConfig.xml"));
		Traingle triangle = (Traingle) beanFactory.getBean("triangle");*/ //Depricated
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Traingle triangle = context.getBean("triangle", Traingle.class);
		//Traingle triangle =  (Traingle) context.getBean("triangle");
		
		triangle.draw();
	}
}
