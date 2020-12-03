package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import business.IDAO;
import controllers.editProductController;
import controllers.formController;

@Stateless
@Local(IDAO.class)
@LocalBean
@Alternative
@ManagedBean
@ViewScoped
public class DAO implements IDAO{
	static String searchinput;
	int inject;
	@Override
	public void reset(ArrayList<Product> results) {
		results.clear();
	}
	@Override
	//THIS IS TEST UPDATE
	public void update(ArrayList<Product> products, int toset) {
		products.add(new Product("00000010000", "Hoodie", 5.00f, "S", "BLK"));
		products.add(new Product("00000020000", "T-Shirt", 7.00f, "L", "GRN"));
		products.add(new Product("00000030000", "Sweater", 11.00f, "M", "BLU"));
		
		
		products.set(toset, new Product("00000040000", "Jacket", 2.00f, "L", "WHT"));
		
	
			System.out.println(products.toString());
			
			
				
					
//				if (tester == "0001") {
//					System.out.println(tester);
//				}
				//String inject = products.get(1).toString();
		/*
		 *  [0001, 00000020000, 00000030000]
		
		 */
	}
	@Override
	//THIS IS REAL UPDATE
	public void testUpdate(Product product, ArrayList<Product> products, int toset, String thecontext) {
		Product replace = product;
		Object key = null;
		for (int i = 0; i < products.size(); i++) {
			
			if (products.get(i).toString() == thecontext) {
				key = products.get(i);
				toset = products.indexOf(key);
				
			}
		}
		System.out.println("=========test assignment==========");
		System.out.println(toset);
		
		System.out.println("Testing key");
		System.out.println(key);
		System.out.println("===========testing thecontext===========");
		System.out.println(key + " Is equal to " + thecontext);
		//======================test replace
		products.set(toset, replace);
		
	}
	

	@Override
	public void delete(Product product, ArrayList<Product> products, int todelete, String thecontext) {
		
		Object key = null;
		
		for (int i = 0; i < products.size(); i++) {
			
			if (products.get(i).toString().equals(thecontext)) {
				key = products.get(i);
				todelete = products.indexOf(key);
				if (key == null || key.equals(null)) {
					System.out.println("========PLAN B==========");
					key = products.get(todelete);
				}
				
			}
		}
		System.out.println("=========test assignment==========");
		System.out.println(todelete);
		
		System.out.println("Testing key");
		System.out.println(key);
		System.out.println("===========testing thecontext===========");
		System.out.println(key + " Is equal to " + thecontext);
		//======================test replace
		try {
		products.remove(todelete);
		}
		catch (java.lang.IndexOutOfBoundsException e) {
			System.out.println("List is empty...");
		}
	}

	@Override
	public void findByID(InputID inputid, ArrayList<Product> products, String contextinput, ArrayList<Product> results) {
		 Object key = null;
		  int index;
		for (int i = 0; i < products.size(); i++) {
			//System.out.println(products.get(i).toString() + ":: " + contextinput);
			if (products.get(i).toString().equals(contextinput)) {
				
				key = products.get(i);
				index = products.indexOf(key);
				if (key == null || key.equals(null)) {
					System.out.println("============PLAN B=============");
					key = products.get(index);
				}
				
				
			}
			
			
		}
		results.add((Product) key);
		System.out.println(key);
		/*
		 * System.out.println("=========test contextinput==========");
		 * System.out.println(contextinput);
		 * 
		 * System.out.println("Testing key"); System.out.println(key);
		 * System.out.println("===========testing thecontext===========");
		 * System.out.println(key + " Is equal to " + contextinput);
		 */
		
	}
	@Override
	public void view(ArrayList<Product> products, String contextview, ArrayList<Product> results) {
		 Object key = null;
		  int index;
		for (int i = 0; i < products.size(); i++) {
			//System.out.println(products.get(i).toString() + ":: " + contextinput);
			if (products.get(i).toString().equals(contextview)) {
				
				key = products.get(i);
				index = products.indexOf(key);
				if (key == null || key.equals(null)) {
					System.out.println("============PLAN B=============");
					key = products.get(index);
				}
				
				
			}
			
			
		}
		results.add((Product) key);
		System.out.println(key);
	}
}



