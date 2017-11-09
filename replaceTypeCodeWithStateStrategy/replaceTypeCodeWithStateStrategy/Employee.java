package replaceTypeCodeWithStateStrategy;

public class Employee {
	
	private int _monthlySalary;
	private int _commission;
	private int _bonus;
	private EmployeeType _type;
    
    
   	public int getType() {
		return _type.getType();
	}
	
	int payAmount() {
		switch (getType()) {
		    case EmployeeType.ENGINEER:
		       return _monthlySalary;
		    case EmployeeType.SALESMAN:
		       return _monthlySalary + _commission;
		    case EmployeeType.MANAGER:
		       return _monthlySalary + _bonus;
		    default:
		       throw new RuntimeException("Incorrect Employee");
		}

	}
}
