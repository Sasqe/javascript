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
public class searchService {
	public void search(InputID inputid) {
		System.out.println(inputid.getInput());
	}
	

}
