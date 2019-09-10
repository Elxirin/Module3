package com.capgemini.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainInheritance {
 public static void main(String[] args) {
	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	 EntityManager em = factory.createEntityManager();
	  
	 Employee1 emp = new Employee1();
	 emp.setName("Tanmay");
	 
	 TemporaryEmployee temp  = new TemporaryEmployee();
	 temp.setName("Shilpa");
	 temp.setDailyWage(500);
	 
	 PermenantEmployee pemp = new PermenantEmployee();
	 pemp.setName("Shivani");
	 pemp.setAnnualSalary(38000);
	 em.getTransaction().begin();
	 em.persist(emp);
	 em.persist(temp);
	 em.persist(pemp);
	 em.getTransaction().commit();
	 System.out.println("Done");
 	}
}
