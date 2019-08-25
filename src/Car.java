public class Car {
	GasTank tank;
	Engine engine;
	Wheels wheels;
	
	public void run() {
		System.out.println("Car is running!");
		this.tank.function();
		this.engine.function();
		this.wheels.function();
	} // run
	
	public Car() {
		this.tank = new GasTank(100);
		this.engine = new Engine(6);
		this.wheels = new Wheels(4);
	} // default constructor
	
	public Car(GasTank tank, Engine engine, Wheels wheels) {
		this.tank = tank;
		this.engine = engine;
		this.wheels = wheels;
	} // constructor
} // class
