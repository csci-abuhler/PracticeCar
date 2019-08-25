
public class Wheels extends CarPart {
	private int wheels;
	
	public Wheels(int wheels) {
		super(100);
		this.wheels = wheels;
	} // constructor
	
	public void function() {
		System.out.println("The number of wheels: " + wheels);
	} // function
} // class
