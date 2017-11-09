package replaceConditionalWithPolymorphism;

public class Engineer extends EmployeeType{
	
	@Override
	int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }

	@Override
	int getType() {
		return  EmployeeType.ENGINEER;
	}

	
}
