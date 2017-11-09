package replaceArrayWithObject;

public class Row {
	
	private final String[] _data = new String[3];

		
	public String getName() {
		return _data[0];
	}
	
	public void setName(String name) {
		 _data[0] = name;
	}

	public int getWins() {
		return Integer.parseInt(_data[1]);
	}
	
	public void setWins(String wins) {
		_data[1] = wins ;
	}
	

}
