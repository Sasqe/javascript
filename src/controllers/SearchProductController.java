package controllers;

import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.DAO;
import beans.InputID;
import beans.Products;
import beans.searchService;
import business.IDAO;



@ManagedBean
@ViewScoped
public class SearchProductController {
	static String contextinput;
	@Inject
	IDAO dao;
	
	public String onSearch(InputID inputid, Products p)
	{
		FacesContext context = FacesContext.getCurrentInstance();
		InputID input = context.getApplication().evaluateExpressionGet(context, "#{inputID}", InputID.class);
		
		//Handle searching
		//current test get input
		//no clue what im doing but thats okay
		
		
		
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("inputID", input);
		contextinput = input.getInput();
		dao.findByID(input, p.getProducts(), contextinput, p.getResults());;
		//return new edit form page
		return "searchresponse.xhtml";
		
	}
	public String onReset(Products p) {
		/*
		 * FacesContext context = FacesContext.getCurrentInstance(); InputID input =
		 * context.getApplication().evaluateExpressionGet(context, "#{inputID}",
		 * InputID.class);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * FacesContext.getCurrentInstance().getExternalContext().getFlash().put(
		 * "inputID", input);
		 */
		dao.reset(p.getResults());
		//return new edit form page
		return "loginresponse.xhtml";
		
	}
	}
	
	

