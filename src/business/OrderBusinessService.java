package business;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

/**
 * Session Bean implementation class OrderBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class OrderBusinessService implements OrdersBusinessInterface {

    /**
     * Default constructor. 
     */
	
    public OrderBusinessService() {
     test();
    }
    

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        System.out.println("Hello from OrdersBusinessService");
    }

}
