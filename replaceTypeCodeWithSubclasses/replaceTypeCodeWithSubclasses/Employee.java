package replaceTypeCodeWithSubclasses;

public abstract class Employee {
	
    int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
               return new Engineer();
            case SALESMAN:
               return new Salesman();
            case MANAGER:
               return new Manager();
            default:
      throw new IllegalArgumentException("Incorrect type code value");
        }
    }
    
    public Employee(int type) {
		_type = type;
	}

    abstract int getType();
	
}
