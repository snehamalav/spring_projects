package hibernate.SpringApp1.model;

public class Employee {
private String full_name;
private Department department;
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Employee(String full_name, Department department) {
	super();
	this.full_name = full_name;
	this.department = department;
}
public Employee() {
	super();
}


}
