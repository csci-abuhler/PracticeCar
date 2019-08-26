// Class that describes the Engine as a car part
public class Engine extends CarPart {
	private int cylinders;
	
	// sets the condition value and number of cylinders 
	public Engine(int cylinders) {
		super(100);
		this.cylinders = cylinders;
	} // constructor
	
	// displays the number of cylinders to the console
	public void function() {
		System.out.println("The number of cylinders: " + cylinders);
	} // function
} // class
