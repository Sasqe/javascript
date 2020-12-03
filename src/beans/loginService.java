package beans;

import java.util.HashMap;




import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import business.dbInterface;

@Stateless
@Local(dbInterface.class)
@LocalBean
@Alternative
@ManagedBean
@ViewScoped
//no construct
public class loginService implements dbInterface {
	//initializing counter for validation/authentificiation
	int counter = 0;
	//initializing key and values for hashmap
	String key;
	String value;
	static HashMap<String, String> loggedUsers = new HashMap<String,String>();
	//overriding register method in order to register the user
	@Override 
	public void register(User user) {
		
		loggedUsers.put(user.getUserName(), user.getPassWord());
		setRegisteredUsers(loggedUsers);
		
		
	}

	//overriding the uathenticate user in order to authenticate the user in login
	@Override
	public boolean authenticate(User user) {
		
		
		System.out.println("======================");
		
		
		
		for (HashMap.Entry<String,String> entry : this.getLoggedUsers().entrySet()) {
			//looping through the hashmap and pairing key and value with the key value pair of the hashmap
			 key = entry.getKey().toString();
			 value = entry.getValue().toString();
		}
		//debugging
		System.out.println("(" + key + "=" + user.getUserName() + "," +  value +  "=" + user.getPassWord() + ")");
		//initial validation, adding one to counter if found a match
		if (key.equals(user.getUserName())) {
			
			counter += 1;
			//debugging
			System.out.println(key + " --- " + value);
		}
		//if match found, return true
		if (counter > 0) {
			return true;
		}
		//else, return false
		else if (counter > 1) {
			System.out.println("There are multiple registered users with this information");
			return false;
		}
		else {
			
			return false;
		}
	}

	
	
	public HashMap<String, String> getLoggedUsers() {
		return loggedUsers;
	}
	public void setRegisteredUsers(HashMap<String, String> loggedUsers) {
		loginService.loggedUsers = loggedUsers;
	}

	@Override
	public HashMap<String, String> loggedUsers() {
		return loggedUsers;
	}


	

}
