package replaceTypeCodeWithStateStrategy;

public abstract class EmployeeType {
	
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
	
	abstract int getType();
	
	static EmployeeType newType(int type) {
		switch (type){
		case ENGINEER:
			return new Engineer();
		case MANAGER:
			return new Manager();
		case SALESMAN:
			return new Salesman();
		default:
			throw new IllegalArgumentException("Incorrect type Employee");
		}
	}

}
