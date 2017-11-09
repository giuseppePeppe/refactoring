package replaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

public class Order {
	
	private Customer _customer;
	
    public 	Order (String customerName) {
        _customer = new Customer(customerName);
    }
 
	public String getCustomer() {
		return _customer.getCustomerName();
	}

	public void setCustomer(String customerName) {
		_customer = new Customer(customerName);
	}
    
    public int numberOfOrdersFor(Collection orders, String customerName) {
        
    	int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
		     if (each.getCustomer().equals(customerName)) 
		    	 result++;
		        }
    	return result;
	}




}
