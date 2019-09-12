package com.capgemini.collections;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.capgemini.FirstDemo.Point;

public class DisplayBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory Post Processor");
		
		Point p = (Point)beanFactory.getBean("point2");
		p.setX(300);
		p.setY(400);
	}

}
