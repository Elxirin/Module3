package com.capgemini.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TEMP")
public class TemporaryEmployee  extends Employee1 {
	private int dailyWage;

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}
}
