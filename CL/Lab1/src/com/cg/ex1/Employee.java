package com.cg.ex1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String buisnessUnit;
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
	public String getBuisnessUnit() {
		return buisnessUnit;
	}
	public void setBuisnessUnit(String buisnessUnit) {
		this.buisnessUnit = buisnessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", buisnessUnit=" + buisnessUnit + ", age=" + age + "]";
	}
	
	
}
