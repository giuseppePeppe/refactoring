package replaceTypeCodeWithStateStrategy;

public class Manager extends EmployeeType{

	@Override
	int getType() {
		return EmployeeType.MANAGER;
	}

}
