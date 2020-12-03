package beans;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;




@ManagedBean
@RequestScoped
public class InputID {

	String input;

	//parameter constructor for beans inputID
	public InputID(String input) {
		this.input = input;
		
	}
	//default constructor for beans user
	public InputID() {
		input = "";
		
	}
	
	//getters and setters
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
		
}

