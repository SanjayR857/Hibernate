package com.cg.jpastart.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpastart.entities.Employee;
import com.cg.jpastart.entities.Manager;

public class InhertanceType {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//create one employee
		Employee employee=new Employee();
		employee.setName("sanjay R");
		employee.setSalary(10000);
		em.persist(employee);
		//create one Manager
		Manager manager=new Manager();
		manager.setName("Varun V");
		manager.setSalary(20000);
		manager.setDepartmentName("sales");
		em.persist(manager);
			em.getTransaction().commit();
			System.out.println("Add one employee and one manager");
			em.close();
			factory.close();
		}
		
}
