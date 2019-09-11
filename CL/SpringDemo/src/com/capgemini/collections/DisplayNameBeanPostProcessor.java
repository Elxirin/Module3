package com.capgemini.collections;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.capgemini.FirstDemo.Point;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Post Process after Initialization "+ beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Post Process Before Initialization "+ beanName);
		if(beanName.equals("point2")) {
			((Point)bean).setX(200);
			((Point)bean).setY(100);
		}
		return bean;
	}

	
	
}
