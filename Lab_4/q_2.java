/*Write a program in Java to define a class Rectangle having data member: length 
and breadth; to calculate the area and perimeter of the rectangle. Use member 
functions to read, calculate and display. */

// import java.util.Scanner;
import java.util.* ;

public class q_2
{
    public static void main(String[] args)
    {
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println(" Area of rectangle:"+area);
    }
}
