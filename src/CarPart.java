
public class CarPart implements Functional {
	private int condition;
	
	public void status() {
		System.out.println("Condition: " + condition);
	} // status

	public CarPart(int condition) {
		this.condition = condition;
	} // constructor
	
	@Override
	public void function() {
		
	} // inherited function
} // class
 