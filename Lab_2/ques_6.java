/*WAP to find the highest mark and average mark secured by him in "5" number of 
subjects.*/

import java.util.*;
public class ques_6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        int a[]=new int[5];int m=0,s=0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>=m)
            m=a[i];
            s+=a[i];
        }
        s/=5;
        System.out.println("Greatest marks= "+m);
        System.out.println("Average marks = "+s);
    }
}
