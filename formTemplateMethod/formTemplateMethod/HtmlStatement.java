package formTemplateMethod;

class HtmlStatement extends Statement {
	
	@Override
	String addFooterLine(Customer aCustomer) {
		return "<P>You owe <EM>" +String.valueOf(aCustomer.getTotalCharge()) +"</EM><P>\n"+ 
			   "On this rental you earned <EM>"+String.valueOf(aCustomer.getTotalFrequentRenterPoints())+
			   "</EM> frequent renter points<P>"; 
	}


	@Override
	String headertString(Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() +"</EM></H1><P>\n";
	}

	@Override
	String retriveEachRental(Rental each) {
		return each.getMovie().getTitle()+ ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
	}

}
