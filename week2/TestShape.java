// Abstract class
abstract class Shape {
    
    // Abstract method
    abstract double area();
}

// Circle class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    double area() {
        return length * width;
    }
}

// Main class
public class TestShape {
    public static void main(String[] args) {
        
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}
