package replaceConditionalWithPolymorphism;

public class Salesman extends EmployeeType {
	
	@Override
	int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }

	@Override
	int getType() {
		return EmployeeType.SALESMAN;
	}

}
