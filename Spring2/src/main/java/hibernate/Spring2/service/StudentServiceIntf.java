package hibernate.Spring2.service;

import java.util.List;

import hibernate.Spring2.model.Student;

public interface StudentServiceIntf {

	
	/*public boolean createStudent(Student stu);*/
/*	public Student getStudent(String id);*/
	public List<Student> getAll(String grade);
}
