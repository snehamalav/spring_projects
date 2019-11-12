package hibernate.SpringApp1.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hibernate.SpringApp1.model.Candidate;
import hibernate.SpringApp1.model.Employee;
import hibernate.SpringApp1.model.Product;
import hibernate.SpringApp1.model.TextEditor;
import hibernate.SpringApp1.service.MathService;

public class AppTest1 {
     private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(".....................");
  Candidate c=(Candidate)ctx.getBean("c1");
  System.out.println(c);
 /* c.setAddress("LANKA");
  System.out.println(c);
 
  */
  
  MathService ms=(MathService)ctx.getBean("dao");
  System.out.println(ms.add(10, 10));
  System.out.println(ms.power(2, 3));
  
  TextEditor t=(TextEditor)ctx.getBean("te");
  t.display();
  Employee emp=(Employee)ctx.getBean("e");
  System.out.println(emp.getFull_name()+ " "+ emp.getDepartment().getName());
  
  
  Product p=(Product)ctx.getBean("pt");
  System.out.println(p.getPname()+" "+p.getPrice()+" "+p.getPc().getProduct_Category());
//((AbstractApplicationContext) ctx).close();
  
	}
}