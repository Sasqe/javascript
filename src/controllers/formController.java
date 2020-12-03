
package controllers;





import java.util.ArrayList;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Product;
import beans.Products;
import beans.User;
import beans.loginService;
import business.IDAO;
@ManagedBean
@ViewScoped

public class formController {
	int toset;
	int todelete;
	@Inject
	IDAO dao;
	
	public String onLogin(loginService lb, Products p) 
	{
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context,"#{user}", User.class);
		
		//calling authenticate method from login service
		lb.authenticate(user);
	
		if (lb.authenticate(user) == false) {
			return "loginfail.xhtml";
		}
		else {
			dao.update(p.getProducts(), 0);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "loginresponse.xhtml";
		}
	}
	
	public String onSubmit(User user)
	{
	FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
	return "NewFile.xhtml";
	}
	public String onFlash(Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context, "#{product}", Product.class);
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("product", product);
		
		
		dao.testUpdate(product, p.getProducts(), toset, editProductController.contextvalue);
	
		//System.out.println(editProductController.contextvalue);
		//return new edit form page
		return "loginresponse.xhtml";
	}
	public String onDelete(Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		Product product = context.getApplication().evaluateExpressionGet(context, "#{product}", Product.class);
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("product", product);
		
		dao.delete(product, p.getProducts(), todelete, deleteProductController.contextdelete);
		
	
		//System.out.println(editProductController.contextvalue);
		//return new edit form page
		return "loginresponse.xhtml";
	}
}
