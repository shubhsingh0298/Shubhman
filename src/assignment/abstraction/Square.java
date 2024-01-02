package assignment.abstraction;

public class Square extends Shape{
	double side;
	public Square(double side) {
		this.side=side;
	}
	@Override
	public void dispalyInfo() {
     System.out.println("Shape name is Square");
     System.out.println("Side = "+side);
	}
	@Override
	public double area() {
				return side*side;
	}
	

}
