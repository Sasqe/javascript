package beans;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Size;

@ManagedBean
@RequestScoped
public class Product {
	//size constraints
	@Size(min = 11, max = 11,  message = "product number must be 11 digits.")
	String productNumber;
	
	String productName;
	float price;
	@Size(min = 1, max = 1, message = "Please enter S, M, or L.")
	String size;
	String color;
	//constructor
	public Product(String productNumber, String productName, float price, String size, String color) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.price = price;
		this.size = size;
		this.color = color;
	}
	public Product() {
		 productNumber = "";
		 productName = "";
		 price = 0;
		 size = "";
		 color = "";
	
	}
	
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return this.getProductNumber();
	}
}
