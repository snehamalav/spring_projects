package hibernate.Spring2;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hibernate.Spring2.controller.StudentController;
import hibernate.Spring2.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
       StudentController controller =(StudentController)applicationContext.getBean("studentController");
    //   System.out.println(controller.createStudent());
       //Student s=controller.getStudent("101");
       //List<Student> list=controller.getAll("a");
       /*for(Student st:list){
    	   
    
       System.out.println(st);
    }*/
       System.out.println(controller.getAll("a"));
}
}
