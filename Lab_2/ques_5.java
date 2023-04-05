/*. WAP to check whether the number is an Armstrong number or not.
Armstrong Number: A positive number is called an Armstrong number if it is equal to the 
sum of cubes of its digits for example 153 = 13+53+33
, 370, 371, 407, etc.*/

import java.util.*;
public class ques_5 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int n1=n;
        int s=0,d;
        while(n>0)
        {
            d=n%10;
            s+=d*d*d;
            n/=10;
        }
        if(n1==s)
        System.out.println("It is an armstrong no.");
        else
        System.out.println("Not an armstrong no.");
    }
}
