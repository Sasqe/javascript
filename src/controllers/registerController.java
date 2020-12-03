package controllers;
import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


import beans.User;
import beans.loginService;
@ManagedBean
@ViewScoped
public class registerController {
	public String onSubmit(loginService lb) 
	{
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context,"#{user}", User.class);
		
		lb.register(user);
		
		System.out.println("---------------------");
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestForm.xhtml";
		
	}
	
	public String onSubmit(User user)
	{
	FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
	return "NewFile.xhtml";
	}
	public String onFlash()
	{
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "NewFile.xhtml?faces-redirect=true";
	}
	public String onFlash(User user) {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "NewFile2.xhtml?faces-redirect=true";
	}
	
}