package com.capgemini.SecondDemo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class MainAppEmpl {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	  EntityManager em = factory.createEntityManager();
	  
	 /* System.out.println("Enter Gender");
	  String gender = sc.nextLine();
	  
	  //TypedQuery<Empl> query = em.createQuery("from Empl where gender=?", Empl.class);
	  TypedQuery<Empl> query = em.createQuery("from Empl where gender=:gen", Empl.class);
	  //query.setParameter(1, gender);
	  query.setParameter("gen", gender);
	  
	  List<Empl> employees = query.getResultList(); 
	  for(Empl employee:employees) {
		  System.out.println(employee);
	  }*/
	  
	  
	  /*Query query = em.createQuery("delete from Empl where id= :eno");
	  query.setParameter("eno", empId);
	  em.getTransaction().begin();
	  int result = query.executeUpdate();
	  em.getTransaction().commit();
	  System.out.println(result + "rows deleted");*/
	  
	  
	  /*System.out.println("Enter Employee ID");
	  int empId = sc.nextInt();
	  
	  TypedQuery<Empl> query = em.createQuery("from Empl where id= :eno", Empl.class);
	  query.setParameter("eno", empId);
	  Empl emp = query.getSingleResult();
	  System.out.println(emp);*/
	  
	  /*System.out.println("Enter Employee Gender");
	  String gender = sc.nextLine();
	  System.out.println("Enter Employee Salary");
	  Double sal = sc.nextDouble();
	  System.out.println("Enter Employee Age");
	  int age = sc.nextInt();
	  
	  Query query = em.createQuery("update Empl set salary=salary+:s, age=age+:a where gender=:g");
	  query.setParameter("s", sal);
	  query.setParameter("a", age);
	  query.setParameter("g", gender);
	  em.getTransaction().begin();
	  int result = query.executeUpdate();
	  em.getTransaction().commit();
	  System.out.println(result+ " row(s) updated");*/
	  
	  TypedQuery<Empl> query = em.createNamedQuery("getAllEmployees", Empl.class);
	  List<Empl> employees = query.getResultList();
	  for (Empl employee : employees) {
		System.out.println(employee);
	}
	  
	  em.close();
	  factory.close();
  }
}
