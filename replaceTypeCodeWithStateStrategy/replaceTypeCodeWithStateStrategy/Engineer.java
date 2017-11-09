package replaceTypeCodeWithStateStrategy;

public class Engineer extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.ENGINEER;
	}

}
