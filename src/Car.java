// Class that combines the car parts into a car
public class Car {
	GasTank tank;
	Engine engine;
	Wheels wheels;
	
	// Runs the car and displays each car parts info
	public void run() {
		System.out.println("Car is running!");
		this.tank.function();
		this.engine.function();
		this.wheels.function();
	} // run
	
	// Default constructor
	public Car() {
		this.tank = new GasTank(100);
		this.engine = new Engine(6);
		this.wheels = new Wheels(4);
	} // default constructor
	
	// Second constructor with customs gas tank, engine, and wheels 
	public Car(GasTank tank, Engine engine, Wheels wheels) {
		this.tank = tank;
		this.engine = engine;
		this.wheels = wheels;
	} // constructor
} // class
