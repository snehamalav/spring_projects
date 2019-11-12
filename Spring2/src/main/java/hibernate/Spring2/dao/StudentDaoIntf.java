package hibernate.Spring2.dao;

import java.util.List;

import hibernate.Spring2.model.Student;

public interface StudentDaoIntf {

	/*
	public boolean createStudent(Student stu);*/
	/*Student getStudent(String id);*/
	public List<Student> getAll(String grade);
}
