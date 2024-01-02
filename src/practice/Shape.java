package practice;


	interface Shape {
	    // Abstract method
	    double calculateArea();

	    // Static method with implementation
	    static void printDescription() {
	        System.out.println("This is a shape interface.");
	    }
	}

	class Circle implements Shape {
	    private double radius;

	    // Constructor of the implementing class
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Implementation of the abstract method
	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	

