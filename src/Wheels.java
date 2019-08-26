// Class that describes the wheels as a car part
public class Wheels extends CarPart {
	private int wheels;
	
	// Constructor that sets the wheels condition and how many wheels a car has
	public Wheels(int wheels) {
		super(100);
		this.wheels = wheels;
	} // constructor
	
	// Displays the number of wheels to the console.
	public void function() {
		System.out.println("The number of wheels: " + wheels);
	} // function
} // class
