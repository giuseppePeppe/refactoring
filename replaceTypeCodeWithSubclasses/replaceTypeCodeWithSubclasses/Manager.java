package replaceTypeCodeWithSubclasses;

public class Manager extends Employee {

	public Manager() {
		super(Employee.MANAGER);
	}
	
	@Override
	int getType() {
		return 0;
	}

}
