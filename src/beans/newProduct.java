package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class newProduct {
public void createNew(Product product) {
		
		Products.products.add(new Product(product.getProductNumber(), product.getProductName(), product.getPrice(), product.size, product.getColor()));
		
		
	
		
	}
}
