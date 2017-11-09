package replaceConditionalWithPolymorphism;

public class Manager extends EmployeeType{
	
	@Override
	int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }

	@Override
	int getType() {
		return EmployeeType.MANAGER;
	}

}
