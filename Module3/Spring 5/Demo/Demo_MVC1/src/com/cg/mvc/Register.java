package com.cg.mvc;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Register {

	@NotEmpty(message="First Name should not be Empty")
	@Size(min=3, max=8, message="Please enter Min 3 to Max 8 Char's")
	private String firstName;
	
	@NotEmpty(message="Lasst Name should not be Empty")
	@Size(min=3, max=8, message="Please enter Min 3 to Max 8 Char's")
	private String lastName;
	
	private char gender;
	
	@NotEmpty(message="Email should not be Empty")
	@Email(message="Please check e-mail pattern ")
	private String email;
	
	private String[] skillSet;
	
	private String city;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
