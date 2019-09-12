package com.capgemini.collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.capgemini.FirstDemo.Point;

@Component
public class Circle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	//@Resource(name="point1")
	@Autowired
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	//@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Circle Points ("+center.getX()+", "+ center.getY() +")");
	}
	
	@Override
	public void setBeanName(String beanName) {	
		System.out.println("Bean name aware: "+ beanName);
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("BeanFatory aware method executed: "+ beanFactory);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	 
		System.out.println("Application Context aware" + applicationContext);
	
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean after Properties Set");
		
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("MyInit Executed");
	}

	@PreDestroy
	public void tearDown() {
		System.out.println("Me destroy method Executed");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable bean Destroy Method Executed");
	}
	
	
	
}
