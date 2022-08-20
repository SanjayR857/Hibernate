package com.cg.jpastart.entities;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class Client {

		public static void main(String[] args)
		{
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			
			Student student=new Student();
			student.setName("Sanjay R");
			
			Address homeaddress=new Address();
			homeaddress.setStreet("Sunkadakatte");
			homeaddress.setCity("bangalore");
			homeaddress.setState("karnataka");
			homeaddress.setZipcode("560901");
			
			//inject address to student table
			student.setAddress(homeaddress);
			
			//persist
			em.persist(student);
			em.getTransaction().commit();
			System.out.println("ONe To ONe Unidireaction");
			em.close();
			factory.close();
			
			

		}

	}

