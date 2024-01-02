package Abstraction;

public abstract class BikeClass {
	//Constructor
	BikeClass(){
		System.out.println("Bike class created!");
	}
	//abstract method
	abstract void run(); //no method body
	
	//non-abstract method
	static void start()// call by claas reference
	{
		System.out.println("Bike Start............!");
	}

	final void stop()
	{
		System.out.println("Bike Stop..............!");
	}
}
