package com.capgemini.BiDirAssossiation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainAssossiation {

 public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		  EntityManager em = factory.createEntityManager();
		  
		 
		  /*Faculty fac = new Faculty();
		  fac.setName("Rahul");
		  
		  Technology tech = new Technology();
		  tech.setTechnologyName("Java");		  
		  fac.setTechnology(tech);
		  tech.setFaculty(fac);*/
		  
		  Faculty fac = new Faculty();
		  fac.setName("Varsha");
		  
		  Technology tech1 = new Technology();
		  tech1.setTechnologyName("JAVA");	
		  Technology tech2 = new Technology();
		  tech2.setTechnologyName("BDD");	
		 
		  fac.getTechnologies().add(tech1);
		  fac.getTechnologies().add(tech2);
		  tech1.setFaculty(fac);
		  tech2.setFaculty(fac);
		 
		  
		  em.getTransaction().begin();
		  em.persist(fac);
		  em.getTransaction().commit();
		  
		 /* Faculty fac = em.find(Faculty.class, 1);
		  System.out.println(fac);
		  em.close();
		  for (Technology tech : fac.getTechnologies()) {
			System.out.println(tech);
		}*/
 }	  
	  	  
}
