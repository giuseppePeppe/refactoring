package extractSubclass;

public class JobItem {
	
	private final int _unitPrice;
	private final int _quantity;
	protected Employee _employee;
	protected boolean _isLabor;
	
	public JobItem (int unitPrice, int quantity) {
	       _unitPrice = unitPrice;
	       _quantity = quantity;
	   }
	

	public int getTotalPrice() {
	       return getUnitPrice() * _quantity;
	   }
   
	public int getUnitPrice(){
	     return _unitPrice;
	   }
  
	public int getQuantity(){
	       return _quantity;
	   }
	
	public boolean isLabor(){
		return false;
	}
   
	}
