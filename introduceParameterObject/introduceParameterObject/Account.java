package introduceParameterObject;

import java.util.Enumeration;
import java.util.Vector;

public class Account {
	
	private final Vector _entries = new Vector();
	
    double getFlowBetween (DataRange range) {
        double result = 0;
        Enumeration e = _entries.elements();
        while (e.hasMoreElements()) {
            Entry each = (Entry) e.nextElement();
            if (range.isbetween(each))
            {
                result += each.getValue();
      }
        }
        return result;
    }
    
 
}
