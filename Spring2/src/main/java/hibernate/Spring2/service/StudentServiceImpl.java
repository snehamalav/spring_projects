package hibernate.Spring2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hibernate.Spring2.dao.StudentDaoIntf;
import hibernate.Spring2.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceIntf {

	@Autowired
	StudentDaoIntf studentDao;

	/*public boolean createStudent(Student stu) {
		boolean flag=studentDao.createStudent(stu);
		return flag;
	}
*/
	/*public Student getStudent(String id) {
		Student s=studentDao.getStudent("101");
		return s;
	}*/
	/*public List<Student> getAll(){
		List<Student> list=studentDao.getAll("a");
		return list;
		
	}*/
	public List<Student> getAll(String grade){
		List<Student> list=studentDao.getAll("a");
		return list;
		
	}
}
