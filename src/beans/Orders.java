package beans;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {
	
	List<Order> orders = new ArrayList<Order>();
	public Orders() {
		orders.add(new Order("00000000000", "This is a product 1", (float)150.00, 1));
		orders.add(new Order("00000000001", "This is a product 2", (float)149.55, 14));
		orders.add(new Order("00000000002", "This is a product 3", (float)12.99, 22));
		orders.add(new Order("00000000003", "This is a product 4", (float)53.60, 15));
		orders.add(new Order("00000000004", "This is a product 5", (float)249.99, 19));
		orders.add(new Order("00000000005", "This is a product 6", (float)9.83, 21));
		orders.add(new Order("00000000006", "This is a product 7", (float)100.00, 33));
		orders.add(new Order("00000000007", "This is a product 8", (float)97.99, 45));
		orders.add(new Order("00000000008", "This is a product 9", (float)120.50, 29));
		orders.add(new Order("00000000009", "This is a product 10", (float)349.50, 45));
		orders.add(new Order("00000000011", "This is a product 11", (float)20.00, 67));
		orders.add(new Order("00000000011", "This is a product 12", (float)303.69, 52));
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}