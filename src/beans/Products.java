package beans;

import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean
@ViewScoped
public class Products {
	
    static ArrayList<Product> products = new ArrayList<Product>();
    static ArrayList<Product> results = new ArrayList<Product>();
	public Products() {
		/*this.productNumber = productNumber;
		this.productName = productName;
		this.price = price;
		this.size = size;
		this.color = color;*/
		
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	public  void setProducts(ArrayList<Product> products) {
		Products.products = products;
	}
	public void test(ArrayList<Product> products) {
		
	}
	public ArrayList<Product> getResults(){
		return results;
	}
	public void setResults(ArrayList<Product> results) {
		Products.results = results;
	}
	

}
