package assignment.abstraction;

import java.util.Scanner;

public class ShapeController {

	public static void main(String[] args) {

		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Sqaure");
	    Scanner sc = new Scanner(System.in);
	    int input =sc.nextInt();
	    Shape shape=null;
	    if(input==1)
	    {
	    	shape=new Circle(8);
	    	shape.area();
	    	shape.dispalyInfo();
	    	
	    }
	    
	    else if (input==2) {
	    	shape=new Square(5);
	    	shape.area();
	    	shape.dispalyInfo();
	    }
	    //logic
	    if(shape!=null) {
	    	//operation
	    	System.out.println("Task Menu : ");
	    	System.out.println("Area of given shape is : \n"+shape);
	    	
	    }
	    else
	    	System.out.println("No shape has selected");
	}

}
