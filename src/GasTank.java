// Class that describes the gas tank as a car part
public class GasTank extends CarPart {
	private int fuelLevel; 
	
	// sets the condition value and gas tank full level
	public GasTank(int fuelLevel) {
		super(100);
		this.fuelLevel = fuelLevel;
	} // constructor
	
	// Returns the current fuel level
	public float getFuelLevel() {
		return fuelLevel;
	} // getter
	
	// Decrements the fuel level by one when called
	public void decFuelLevel() {
		if (fuelLevel > 0) {
			fuelLevel--;
		} else {
			System.out.println("Fuel is empty!");
		} // if
	} // decFuelLevel
	
	// Sets the fuel level. It rejects levels less than zero.
	public void setFuelLevel(int fuelLevel) {
		if (fuelLevel < 0) {
			fuelLevel = 0;
			System.out.println("Gas tank cannot have less than zero gas!");
		} else {
			this.fuelLevel = fuelLevel;
			System.out.println("Fuel level changed.");
		} // if
	} // setter
	
	// Displays how full the gas tank is
	public void function() {
		System.out.println("The amount of gas remaining is: " + fuelLevel);
	} // func
} // GasTank
