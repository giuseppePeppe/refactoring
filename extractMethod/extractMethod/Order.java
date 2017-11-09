package extractMethod;

public class Order {
	
	int _id;
	String _description;
	int _qty;
	double _unitprice;

	public Order(int id, String description) {
		_id = id;
		_description = description;
	}
	
	public double getAmount(){
		
		return _qty *_unitprice;
		
	}
	
	
}
