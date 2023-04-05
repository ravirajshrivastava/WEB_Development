// WAP to calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.

import java.util.*;
public class ques_4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%3 == 0)
            {
                sum += i;
            }

        }
        System.out.println("Required sum of the numbers: "+sum);
        
    }     
}
