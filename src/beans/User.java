package beans;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@ManagedBean
@RequestScoped
public class User {
@NotNull(message = "First Name is a required field.")
@Size(min = 3, max = 15, message = "First Name must be 3-15 characters.")
	String firstName;
@NotNull(message = "Last Name is a required field.")
@Size(min = 3, max = 15, message = "Last Name must be 3-15 characters.")
	String lastName;
	String email;
	String phoneNumber;
	String userName;
	String passWord;
	//parameter constructor for beans user
	public User(String firstName, String lastName, String email, String phoneNumber, String userName, String passWord) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.passWord = passWord;
	}
	//default constructor for beans user
	public User() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
		userName = "";
		passWord = "";
	}
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
		
}


