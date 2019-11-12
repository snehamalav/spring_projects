package hibernate.Spring2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hibernate.Spring2.model.Student;
import hibernate.Spring2.service.StudentServiceIntf;

@Controller("studentController")
public class StudentController {
	@Autowired
StudentServiceIntf studentService;

	/*public boolean createStudent()
	{
		Student stu=new Student();
		
		stu.setId("102");
		stu.setName("anku");
		stu.setGrade("b");
		boolean flag=studentService.createStudent(stu);
		return flag;
		
	}*/

	/*
	public Student getStudent(String id)
	{
		
		Student st=studentService.getStudent("101");
		return st;
		
	}*/
	public List<Student> getAll(String grade){
		List<Student> list=studentService.getAll("a");
		return list;
		
	}
}
