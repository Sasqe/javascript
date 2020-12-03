package controllers;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


import beans.Product;
import beans.Products;

@ManagedBean
@ViewScoped
public class deleteProductController {
	
	static String contextdelete;
	public String onAssign(Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context, "#{product}", Product.class);
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("product", product);
		
		contextdelete = product.getProductNumber();
		
		System.out.println("===========Test from deleteController assign========");
		System.out.println(contextdelete);
		//return new edit form page
		return "confirmdelete.xhtml";
		
	}
}
