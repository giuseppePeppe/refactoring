package formTemplateMethod;

class TextStatement extends Statement{
	
	@Override 
	String addFooterLine(Customer aCustomer) {
	return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
    	   "You earned " +String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
           " frequent renter points";
}

	@Override 
	String retriveEachRental(Rental each) {
	return "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
}

	@Override 
	String headertString(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}
}
 