package extractClass;

public class TelephoneNumber {
	
	
	private int _areaCode;
	private int _number;

	public int getAreaCode() {
		return _areaCode;
	}

	public void setAreaCode(int areaCode) {
		_areaCode = areaCode;
	}

	public String getNumber() {
		return  ("("+_areaCode +") "+ _number).toString();
	}

	public void setNumber(int number) {
		_number = number;
	}
	
	

}
