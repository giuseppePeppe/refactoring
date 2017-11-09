package formTemplateMethod;
import java.util.Enumeration;

	public abstract class Statement {
		
	public String value(Customer aCustomer) {
	        Enumeration rentals = aCustomer.getRentals();
	        String result = headertString(aCustomer); 
	        while (rentals.hasMoreElements()) {
	            Rental each = (Rental) rentals.nextElement();
	            result += retriveEachRental(each); 
	        }
	        //add footer lines
	        result += addFooterLine(aCustomer);  
	     return result;
	   }
	
	abstract String headertString(Customer aCustomer);
	abstract String retriveEachRental(Rental aRental);
	abstract String addFooterLine(Customer aCustomer);
}
