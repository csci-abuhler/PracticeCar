
public class Engine extends CarPart {
	private int cylinders;
	
	public Engine(int cylinders) {
		super(100);
		this.cylinders = cylinders;
	} // constructor
	
	public void function() {
		System.out.println("The number of cylinders: " + cylinders);
	} // function
} // class
