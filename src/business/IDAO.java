package business;

import java.util.ArrayList;

import beans.InputID;
import beans.Product;

public interface IDAO {
	public void update(ArrayList<Product> products, int toset);
	public void delete(Product product, ArrayList<Product> products, int todelete, String thecontext);
	public void findByID(InputID inputid, ArrayList<Product> products, String contextinput, ArrayList<Product> results);
	public void testUpdate(Product product, ArrayList<Product> products, int toset, String thecontext);
	public void reset(ArrayList<Product> results);
	public void view(ArrayList<Product> products, String contextview, ArrayList<Product> results);
	
	//findall?
	
	
}
