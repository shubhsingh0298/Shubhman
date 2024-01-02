package Abstraction;

public class Demo {

	public static void main(String[] args) {
	
	System.out.println("TVS");
	BikeClass obj = new TVS();
	BikeClass.start(); //non abstract method
	obj.run(); //abstract method
	obj.stop(); //non abstract method
	System.out.println("Honda");
	BikeClass obj1= new Honda();
	BikeClass.start();
	obj1.run();
	BikeClass.start();
	System.out.println("Yamaha");
	BikeClass obj2= new Yamaha();
	BikeClass.start();
	obj2.run();
	
	
	
	
	
	
	}

}
