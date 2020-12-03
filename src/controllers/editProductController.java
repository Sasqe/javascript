package controllers;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


import beans.Product;
import beans.Products;

@ManagedBean
@ViewScoped
public class editProductController {
	static String contextvalue;
	public String onAssign(Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context, "#{product}", Product.class);
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("product", product);
		
		contextvalue = product.getProductNumber();
		
		System.out.println("===========Test from editController assign========");
		System.out.println(contextvalue);
		//return new edit form page
		return "editProductForm.xhtml";
		
	}
}
