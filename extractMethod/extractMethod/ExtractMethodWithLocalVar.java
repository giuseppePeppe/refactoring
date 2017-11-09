package extractMethod;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethodWithLocalVar {
	
	
	String _name;
	Vector<Order> _orders;
	
	void printOwing() {
	       
	       printBanner();
	       double result = getOutstanding();
	       printDetail(result);
	   }
	
	private void printBanner() {
		System.out.println("Hello world!");
	}

	private void printDetail(double amount) {
		  System.out.println ("name:" + _name);
	      System.out.println ("amount" + amount);
	}
	
	private double getOutstanding(){
		
		Enumeration<Order> e = _orders.elements();
	    double result = 0.0;
		// calculate outstanding
	       while (e.hasMoreElements()) {
	        Order each = e.nextElement();
	           result += each.getAmount();
	           
	       }
		return result;
		
	}

}
