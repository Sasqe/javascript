package business;



import java.util.HashMap;

import javax.ejb.Local;

import beans.User;

@Local
public interface dbInterface {
	HashMap<String,String> loggedUsers();
	public void register(User user);
	public boolean authenticate(User user);
	
	
}
