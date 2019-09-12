package com.cg.ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		context.registerShutdownHook();
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println("Employee details\n-----------------------------");
		System.out.println("Employee Id : " + emp.getEmployeeId());
		System.out.println("Employee Name : "+ emp.getEmployeeName());
		System.out.println("Employee Salary : "+ emp.getSalary());
		System.out.println("Employee BU : "+ emp.getBuisnessUnit());
		System.out.println("Employee Age : "+ emp.getAge());
	}
}
