package preserveWholeObject;

public class Room{
 
	private TempRange _myTempRange;
	 
	boolean	withinPlan(HeatingPlan plan) {
	    return plan.withinRange(_myTempRange);
	}

	public TempRange getdaysTempRange() {
		return _myTempRange;
	}

	public void setMyTempRange(TempRange myTempRange) {
		_myTempRange = myTempRange;
	}

	

}
	
