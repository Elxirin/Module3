package com.capgemini.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PERM")
public class PermenantEmployee extends Employee1 {
	private double annualSalary;

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public String toString() {
		return "PermenantEmployee [annualSalary=" + annualSalary + "]";
	}
}
