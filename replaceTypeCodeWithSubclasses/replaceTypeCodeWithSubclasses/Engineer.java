package replaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

	public Engineer() {
		super(Employee.ENGINEER);
	}

	@Override
	public int getType() {
		return Employee.ENGINEER;
	}

}
