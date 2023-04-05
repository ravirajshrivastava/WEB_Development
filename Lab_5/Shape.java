import java.util.Scanner;

class Shape {
    protected double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public void showArea() {
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }

    public void showArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length, breadth);

        c.showArea();
        r.showArea();
    }
}

