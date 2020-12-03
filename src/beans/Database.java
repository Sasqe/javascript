package beans;



import java.util.HashMap;
import java.util.Map.Entry;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Database {
	//--create new hashmap registeredusers
	HashMap<String,String> registeredUsers = new HashMap<String,String>();
	//--implemented methods used for interface management
	public HashMap<String, String> getRegisteredUsers() {
		return registeredUsers;
	}
	public void setRegisteredUsers(HashMap<String, String> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}
	
	
	
}


	
