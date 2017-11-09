package preserveWholeObject;

public class TempRange {
	
	private final int _low;
	private final int _high;
	
	public TempRange(int low, int high) {
		
		_low = low;
		_high = high;
		
	}

	public int getLow() {
		return _low;
	}

	public int getHigh() {
		return _high;
	}
	
	public boolean isbetween( TempRange rg) {
		
		return (rg.getLow() >_low &&  rg.getHigh() < _high); 
		
	}

}
