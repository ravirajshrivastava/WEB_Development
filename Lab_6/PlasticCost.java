/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.*/

package Lab_6;
import java.util.*;

class TwoDPlastic {
    protected double length;
    protected double breadth;

    public TwoDPlastic(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class ThreeDPlastic extends TwoDPlastic {
    protected double height;

    public ThreeDPlastic(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate cost:");
        System.out.println("1. 2D sheet");
        System.out.println("2. 3D box");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the sheet in feet: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the sheet in feet: ");
                double breadth = sc.nextDouble();

                TwoDPlastic sheet = new TwoDPlastic(length, breadth);
                double sheetArea = sheet.getArea();
                double sheetCost = sheetArea * 40;

                System.out.println("Area of sheet: " + sheetArea + " sq. ft.");
                System.out.println("Cost of sheet: Rs. " + sheetCost);
                break;
            case 2:
            System.out.print("Enter the length of the box in feet: ");
                double boxLength = sc.nextDouble();
                System.out.print("Enter the breadth of the box in feet: ");
                double boxBreadth = sc.nextDouble();
                System.out.print("Enter the height of the box in feet: ");
                double boxHeight = sc.nextDouble();

                ThreeDPlastic box = new ThreeDPlastic(boxLength, boxBreadth, boxHeight);
                double boxVolume = box.getVolume();
                double boxCost = boxVolume * 60;

                System.out.println("Volume of box: " + boxVolume + " cu. ft.");
                System.out.println("Cost of box: Rs. " + boxCost);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
            }
        }
    }