package com.capg.student.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Student {
	
	@Id
	@SequenceGenerator(name = "studIdGen", sequenceName = "studId", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "studIdGen", strategy = GenerationType.SEQUENCE )
	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", stream=" + stream + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@NotEmpty(message = "Name is Empty")
	@Pattern(regexp = "[A-Z][A-Za-z]{2,}", message="First Letter should be Capital and must contain only letters")
    private String name;
	@Max(30)
    private int age;
	@Pattern(regexp = "(CS|EC|MECH)", message = "Stream should be CS, EC, MECH")
    private String stream;

}
