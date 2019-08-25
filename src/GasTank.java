
public class GasTank extends CarPart {
	private int fuelLevel; 
	
	public GasTank(int fuelLevel) {
		super(100);
		this.fuelLevel = fuelLevel;
	} // constructor
	
	public float getFuelLevel() {
		return fuelLevel;
	} // getter
	
	public void setFuelLevel(int fuelLevel) {
		if (fuelLevel < 0) {
			fuelLevel = 0;
			System.out.println("Gas tank cannot have less than zero gas!");
		} else {
			this.fuelLevel = fuelLevel;
			System.out.println("Fuel level changed.");
		} // if
	} // setter
	
	public void function() {
		System.out.println("The amount of gas remaining is: " + fuelLevel);
	} // func
} // GasTank
