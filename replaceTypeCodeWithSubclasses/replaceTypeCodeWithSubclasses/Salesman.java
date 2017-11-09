package replaceTypeCodeWithSubclasses;

public class Salesman extends Employee{

	public Salesman() {
		super(Employee.SALESMAN);
	}
	
	@Override
	public int getType() {
		return Employee.SALESMAN;
	}
	


}
