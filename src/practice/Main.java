package practice;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Calling the static method of the interface
        Shape.printDescription();
    }
}
