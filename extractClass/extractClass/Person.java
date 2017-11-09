package extractClass;

public class Person {
	
	 private String _name;
	 private final TelephoneNumber phonenumber = new TelephoneNumber();
	
	 public String getName() {
	         return _name;
	     }
	     public String getTelephoneNumber(){
	         return phonenumber.getNumber();
	     }
	     public TelephoneNumber getOfficeTelephone() {
	         return phonenumber;
	     }
	   
}
