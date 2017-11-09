package replaceConditionalWithPolymorphism;

public abstract class EmployeeType {
	
	protected static final int ENGINEER = 0;
	protected static final int SALESMAN = 1;
	protected static final int MANAGER = 2;
	
	abstract int payAmount(Employee employee);
	abstract int getType();
	
	
}
