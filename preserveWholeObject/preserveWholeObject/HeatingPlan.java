package preserveWholeObject;

public class HeatingPlan {
	
	TempRange _range;
		
	boolean withinRange (TempRange roomRange) {
	    return (_range.isbetween(roomRange));
	}

}
