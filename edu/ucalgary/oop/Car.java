package edu.ucalgary.oop;

public class Car {

	private String model;
	private Driver driver;
	private Engine engine;


	public Car(String model, Driver driver, Engine engine) {
		this.model = model;
		this.driver = driver;
		this.engine = engine;
	}


	// implement shallow vs. deep copy thing here
	public Car copy(boolean deepCopy) {
		if (!deepCopy) {
			return new Car(this.model, this.driver, this.engine);
		}

		Driver driverCopy = (this.driver == null) ? null : new Driver(this.driver);
		Engine engineCopy = (this.engine == null) ? null : new Engine(this.engine);
		return new Car(this.model, driverCopy, engineCopy);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

} 
