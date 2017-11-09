package extractSubclass;

public class LaborItem extends JobItem{

	public LaborItem (int quantity, Employee employee) {
		super (0, quantity);
		_employee = employee;
	}
	
	public Employee getEmployee() {
	       return _employee;
	   }
	
    @Override
	public boolean isLabor() {
        return true;
    }
    
    @Override
	public int getUnitPrice(){
    	return _employee.getRate();
    }

	
	

}
