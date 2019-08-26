// General class that is inherited by the GasTank, Wheels, and Engine classes 
public class CarPart implements Functional {
	private int condition;
	
	// prints condition value for each car part
	public void status() {
		System.out.println("Condition: " + condition);
	} // status

	// sets each car part condition value
	public CarPart(int condition) {
		this.condition = condition;
	} // constructor
	
	@Override
	public void function() {
		// purposefully left empty
	} // inherited function
} // class
 