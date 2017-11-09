package formTemplateMethod;

public class Movie {
		
	   public static final int  CHILDRENS = 2;
	   public static final int  REGULAR = 0;
	   public static final int  NEW_RELEASE = 1;
	   private double _price;
	   private final String _title;
	   
	   public Movie(String title, int priceCode) {
		   _title = title;
	       setPriceCode(priceCode);
	   }
	   
	   public double getPriceCode() {		   
	       return _price;
	   }
	   
	   public void setPriceCode(double value) {
		  _price = value;
	   }
	   
	   public String getTitle (){
	       return _title;
	   };
	   
	  public double getCharge(int daysRented){
	        double result = 2;
	        if (daysRented > 2)
	            result += (daysRented -2) * 1.5;
	        return result;
	    }
	   public int getFrequentRenterPoints(int daysRented) {
		    
			 if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
				 return 2;
	         else
	        	 return 1;
		   }
}
