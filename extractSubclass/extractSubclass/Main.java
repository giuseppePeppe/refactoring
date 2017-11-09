package extractSubclass;

public class Main {

	public static void main(String[] args) {
		
		JobItem jobItem1 = new LaborItem(5, new Employee(2));
		
		JobItem jobItem2 = new JobItem(4, 5);
		
		System.out.println("Job1 : " +jobItem1.getTotalPrice());
		System.out.println("Job2 : " +jobItem2.getTotalPrice());
		

	}

}
