package formTemplateMethod;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private final String _name;
	   private final Vector _rentals = new Vector();
	   public Customer (String name){
	       _name = name;
	   };
	   public void addRental(Rental arg) {
	     _rentals.addElement(arg);
	   }
	   public String getName (){	       
		   return _name;
	   }
	   
	public double getTotalFrequentRenterPoints() {
		int result = 0;
	     Enumeration rentals = _rentals.elements();
	     while (rentals.hasMoreElements()) {
	         Rental each = (Rental) rentals.nextElement();
	         result += each.getFrequentRenterPoints();
	     }
	     return result;
	}
	
	public double getTotalCharge() {
		
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result +=each.getCharge();
			
		}
		
		return result;
	}
	public Enumeration getRentals() {
		return _rentals.elements();
	}
	

}
