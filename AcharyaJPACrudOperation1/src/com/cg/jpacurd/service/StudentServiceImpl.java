package com.cg.jpacurd.service;
    import com.cg.jpacurd.dao.StdentDaoImpl;
	import com.cg.jpacurd.dao.StudentDao;
	import com.cg.jpacurd.entities.Student;
	public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	public StudentServiceImpl()
	{

	dao = new StdentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	}
	@Override
	public Student findStudentById(int id) {
	//no need of transaction, as it's an read operation
	Student student = dao.getStudentById(id);
	return student;
	}
	}

