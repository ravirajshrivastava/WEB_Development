package Lab_6;

public class Plate {
    private double length;
    private double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor is called.");
    }

}

public class Box extends Plate {
    private double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor is called.");
    }
}

public class WoodBox extends Box {
    private double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor is called.");
    }

}

public class Test {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 20, 30,5);
    }
}