package controllers;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Product;
import beans.Products;
import business.IDAO;

@ManagedBean
@ViewScoped
public class viewProductController {
	static String contextview;
	@Inject
	IDAO dao;
	public String onView(Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context, "#{product}", Product.class);
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("product", product);
		
		contextview = product.getProductNumber();
		dao.view(p.getProducts(), contextview, p.getResults());
		System.out.println("===========Test from viewController assign========");
		System.out.println(contextview);
		//return new edit form page
		return "viewProductForm.xhtml";
		
	}
}
