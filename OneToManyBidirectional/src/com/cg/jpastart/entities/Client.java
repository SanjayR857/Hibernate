package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=factory.createEntityManager();
	em.getTransaction().begin();
    //create dept
	
	Department department=new Department();
	department.setId(10);
	department.setName("c2tc");
	
	Department department1=new Department();
	department1.setId(11);
	department.setName("c2c");
	
	//create instances employees
	
	Employee e1=new Employee();
	e1.setName("sanjay r");
	e1.setSalary(458);
	
	Employee e2=new Employee();
	e2.setName("varun v");
	e2.setSalary(345);
	
	Employee e3=new Employee();
	e3.setName("Babu");
	e3.setSalary(234);
	
	//association emp to dept
	
	department.addEmployee(e1);
	department1.addEmployee(e2);
	department.addEmployee(e3);
	
	em.persist(department1);
	em.persist(department);
	
	em.getTransaction().commit();
	em.close();
	factory.close();
}
}
