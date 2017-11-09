package replaceMethodWithMethodObject;

public class Gamma {

	private final Account _account;
	private final int _inputVal;
    private final int _quantity;
    private final int _yearToDate;
    int _importantValue1;
    int _importantValue2;
    int _importantValue3;
	
	public Gamma(Account account, int inputval, int quantity, int yearToDate) {
		
		 _account = account;
		 _inputVal = inputval;
		 _quantity = quantity;
		 _yearToDate = yearToDate;
		 
	}
	
	public int compute(){
		
		int importantValue1 = (_inputVal * _quantity) + _account.delta();
        int importantValue2 = (_inputVal * _yearToDate) + 100;
        if ((_yearToDate - importantValue1) > 100)
            importantValue2	-= 20;
        int importantValue3 = importantValue2 * 7;
        // and so on.
        return importantValue3 - 2 * importantValue1;
	}

	public Account getAccount() {
		return _account;
	}

	public int getQuantity() {
		return _quantity;
	}

	public int getInputVal() {
		return _inputVal;
	}

	public int getYearToDate() {
		return _yearToDate;
	}
	
	
}
