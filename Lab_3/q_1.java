// WAP to find the largest among 3 numbers user entered nos. at 
// the command prompt using Java.

import java.util.*;

// import javax.lang.model.util.ElementScanner14;
public class q_1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = sc.nextInt();
        if(a > b && a >c)
        {
            System.out.println("Largest among three is: "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest among three is: "+b);
        }
        else
        {
            System.out.println("Largest among three is: "+c);
        }
    }  
}