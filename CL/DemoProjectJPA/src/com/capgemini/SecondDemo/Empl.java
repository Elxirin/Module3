package com.capgemini.SecondDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="employee_det")
@NamedQueries({
@NamedQuery(name = "getAllEmployees", query = "from Empl"),
@NamedQuery(name = "getEmployeeByGender", query = "from Empl where gender=:gen")
})
public class Empl {
	@Id
	@Column(name="empId")
	private int id;
	@Column(name="empName")
	private String name;
	@Transient
	private String gender;
	private int age;
	@Column(name="annualSalary")
	private double salary;
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
