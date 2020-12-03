package controllers;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.Product;
import beans.Products;
import beans.newProduct;



@ManagedBean
@ViewScoped
public class creatorController {
	public String onSubmit(newProduct np) 
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context,"#{product}", Product.class);
		
		np.createNew(product);
		
		System.out.println("---------------------");
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("product", product);
		return "loginresponse.xhtml";
		
	}
	public String onTest(Products p) 
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context,"#{product}", Product.class);
		System.out.println("Testing...");
		
		
		System.out.println("---------------------");
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("product", product);
		return "loginresponse.xhtml";
		
	}
}