package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InhertanceTest {
	public static void main(String[] args) {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
EntityManager em=factory.createEntityManager();
em.getTransaction().begin();
//create one employee
Employee employee=new Employee();
employee.setName("sanjay");
employee.setSalary(10000);
em.persist(employee);
//create one Manager
Manager manager=new Manager();
manager.setName("Varun");
manager.setSalary(20000);
manager.setDepartmentName("sales");
em.persist(manager);
	em.getTransaction().commit();
	System.out.println("Add one employee and one manager");
	em.close();
	factory.close();
}
}