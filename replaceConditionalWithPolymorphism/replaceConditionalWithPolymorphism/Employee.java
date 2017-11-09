package replaceConditionalWithPolymorphism;

public class Employee {
	
	private EmployeeType _type;
	private int _monthlySalary;
	private int _commission;
	private int _bonus;
	
	 int payAmount() {
	        return _type.payAmount(this);
	    }

	public int getMonthlySalary() {
		return _monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		_monthlySalary = monthlySalary;
	}

	public int getBonus() {
		return _bonus;
	}

	public void setBonus(int bonus) {
		_bonus = bonus;
	}

	public int getCommission() {
		return _commission;
	}

	public void setCommission(int commission) {
		_commission = commission;
	}

}
