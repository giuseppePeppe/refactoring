package replaceTempWithQuery;

public class Refactor {
	
	double _basePrice;
	int _quantity;
	double _itemPrice;
	
	public double getBaseprice(){
	     double basePrice = _quantity * _itemPrice;
	     if (basePrice > 1000)
	         return basePrice * 0.95;
	     else
	         return basePrice * 0.98;
	}
	
	
	public double getBaseProce(){
		
		return basePrice() >1000 ? basePrice()*0.95 : basePrice()*0.98;
	}

	private double basePrice() {
		return _quantity * _itemPrice;
	}
	 

}
