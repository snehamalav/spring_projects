package hibernate.SpringApp1.model;

public class ProductCategory {
private String Product_Category;

public String getProduct_Category() {
	return Product_Category;
}

public void setProduct_Category(String product_Category) {
	Product_Category = product_Category;
}

public ProductCategory(String product_Category) {
	super();
	Product_Category = product_Category;
}

public ProductCategory() {
	super();
}



}
