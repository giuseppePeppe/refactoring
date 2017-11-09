package decomposeConditionals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DecomposeConditional {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
	private static final String SUMMER_START = "21-06-2017" ;
	private static final String SUMMER_END = "21-09-2017"; 
	
	Date date;
	int charge;
	int quantity;
	private final int _winterRate;
	private final int _winterServiceCharge;
	private final int _summerRate;
	
	public DecomposeConditional(int winterRate, int winterServiceCharge, int summerRate) {
		
		_winterRate = winterRate;
		_summerRate = summerRate;
		_winterServiceCharge = winterServiceCharge;
		
	}
	
	
//	public void checkCharge() throws ParseException{
//		
//		if (date.before (sdf.parse(SUMMER_START)) || date.after(sdf.parse(SUMMER_END))){
//				charge = quantity * _winterRate + _winterServiceCharge;
//		}
//		else 	{charge = quantity * _summerRate;
//		}
//	}
	
	
	public void checkChargeRefactor() throws ParseException{
		
		if (isSummer(date)){
				
			charge = summerRate(quantity);
		}
		else
		{
			charge = winterrate(quantity);
		}
	}


	private int winterrate(int quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}


	private int summerRate(int quantity) {
		return quantity * _summerRate;
	}


	private boolean isSummer(Date date) throws ParseException {
		return date.after (sdf.parse(SUMMER_START)) || date.before(sdf.parse(SUMMER_END));
	}

}
