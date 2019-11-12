package hibernate.SpringApp1.model;

public class Product {
private String pname;
private int price;
private ProductCategory pc;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public ProductCategory getPc() {
	return pc;
}
public void setPc(ProductCategory pc) {
	this.pc = pc;
}

public Product() {
	super();
}

}
