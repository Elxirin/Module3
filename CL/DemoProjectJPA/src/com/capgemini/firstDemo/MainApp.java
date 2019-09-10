package com.capgemini.firstDemo;

/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
//		Employee emp = new Employee(102,"Suraj","Male",23,550000);
//		em.getTransaction().begin();
//		em.persist(emp);
//		em.getTransaction().commit();
//		System.out.println("Date Saved");
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class, 102);
		System.out.println(emp);
		emp.setSalary(570000);
		em.getTransaction().commit();
	}
}*/


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

 

public class MainApp {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        
        /*Employee emp = new Employee(103, "John", "Male", 36, 000);
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println("Data Saved");*/
        
        /*Employee emp = em.find(Employee.class, 102);
        System.out.println(emp);*/
        
        /*em.getTransaction().begin();
        Employee emp = em.find(Employee.class, 101);
        System.out.println(emp);
        emp.setSalary(99000);
        em.getTransaction().commit();
        System.out.println("After commit");
        System.out.println(emp);*/
        
        /*em.getTransaction().begin();
        Employee emp = em.find(Employee.class, 101);
        System.out.println(emp);
        em.remove(emp);
        em.getTransaction().commit();
        System.out.println("After commit");
        System.out.println(emp);*/
        
        Employee emp = new Employee();
        emp.setName("Shrbbbash");
        emp.setGender("Male");
        emp.setAge(21);
        emp.setSalary(45000);
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println(emp);
        System.out.println("Data Saved");
        
        /*All types of crud operations done using hibernate without handling any type of databse operations*/
        
        
        
        
    }
}
