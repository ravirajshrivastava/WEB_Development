// WAP to find the perimeter and area of a circle given a value of radius.
import java.util.*;
public class ques_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = sc.nextInt();
        System.out.println("\nRequired perimeter: "+2*3.14*r);
        System.out.println("Required area: "+3.14*r*r);
    }   
}
