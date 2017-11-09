package substituteAlgorithm;

import java.util.Arrays;
import java.util.List;

public class refactor {
	
	
	String foundPerson(String[] people){
        for (int i = 0; i < people.length;i++) {
            if (people[i].equals ("Don")){
                return "Don";
            }
            if (people[i].equals ("John")){
                return "John";

            }
            if (people[i].equals ("Kent")){
                return "Kent";
            }
        }
        return "";
    }
	
	String findPerson(String[] people){
		
		List<String> listPeople = Arrays.asList(new String[] {"Don", "Jhon","Kent"});
		
		for (String person : people) {
			if (listPeople.contains(person)){
				return person;
			}
		}
		
	 return "";	
	}

}
