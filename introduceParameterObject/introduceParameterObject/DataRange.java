package introduceParameterObject;

import java.util.Date;

public class DataRange {
	
	private final Date _start;
	private final Date _end;
	
	public DataRange(Date start, Date end) {
		
		_start = start;
		_end = end;
		
	}

	public Date getStart() {
		return _start;
	}

	public Date getEnd() {
		return _end;
	}

	public boolean isbetween( Entry entry) {
		
		return (entry.getDate().equals(_start) ||
				entry.getDate().equals(_end) ||
				(entry.getDate().after(_start) &&  entry.getDate().before(_end))); 
		
	}
	
	

}
