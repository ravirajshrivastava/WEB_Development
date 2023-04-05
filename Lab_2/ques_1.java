// WAP to find out square root of a number without using library function.

import java.util.*;
public class ques_1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        float i;
        for( i = 1; i<a/2; i++)
        {
            if(a/i == i)
            {
                System.out.println("Square root of the number is:"+i);
                break;
            }
        }
        if(a/i != i)
        {
            System.out.println("The number has no square root.");
        }
        
    }
}