package com.cg.ex2;

public class Employee1{

	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU buisnessUnit;
	private int age;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", \nsbuDetails=" + buisnessUnit + ", age=" + age + "]";
	}
	public SBU getBuisnessUnit() {
		return buisnessUnit;
	}
	public void setBuisnessUnit(SBU buisnessUnit) {
		this.buisnessUnit = buisnessUnit;
	}
	
	
	
	
}
