package assignment.abstraction;

public class Circle extends Shape{
	
double radius;
public Circle(double radius) {
	this.radius=radius;
	
}
@Override
public void dispalyInfo() {
System.out.println("Shape name is Circle");	
}
@Override
public double area() {
	;
	return Math.PI*radius*radius;
}

}
