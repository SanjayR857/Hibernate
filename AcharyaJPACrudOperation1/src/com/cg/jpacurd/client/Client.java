package com.cg.jpacurd.client;

	import com.cg.jpacurd.entities.Student;
	import com.cg.jpacurd.service.*;
	import com.cg.jpacurd.*;
	
	public class Client {
	public static void main(String[] args) {
	//Debug this program as Debug -> Debug as Java Application

	StudentService service = new StudentServiceImpl();

	Student student = new Student();
	// Create Operation
	student.setStudentId(101);
	student.setName("Sanjay");
	service.addStudent(student);

	//at this breakpoint, we have added one record to table
	// Retrieve Operation
	student = service.findStudentById(101);
	System.out.print("ID:"+student.getStudentId());
	System.out.println(" Name:"+student.getName());

	// Update Operation
	student = service.findStudentById(101);
	student.setName("Sanjay R");
	service.updateStudent(student);

	//at this breakpoint, we have updated record added in first section

	student = service.findStudentById(101);
	System.out.print("ID:"+student.getStudentId());
	System.out.println(" Name:"+student.getName());

	//at this breakpoint, record is removed from table
	// Delete Operation
	student = service.findStudentById(101);
	service.removeStudent(student);
	System.out.println("End of program/Life cycle completed...");

	}
	}

