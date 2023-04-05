/*WAP to find the largest among three numbers x, y, and z. You should use if-then-else 
construct in Java.*/

import java.util.*;

// import javax.lang.model.util.ElementScanner14;
public class ques_3 
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
            System.out.println("Largest amon three is: "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest amon three is: "+b);
        }
        else
        {
            System.out.println("Largest amon three is: "+c);
        }
    }  
}
