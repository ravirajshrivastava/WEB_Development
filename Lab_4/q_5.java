/*Write a program in Java to define a class Number with appropriate data 
members and member functions to input n number of integers and swap the 
biggest and smallest elements. Use member functions read(), swap() and 
display(). */

package Lab_4;


System.out.print(" "+a[i]);
}

}

public static void main()
{
Scanner sc1=new Scanner(System.in);
System.out.println("enter no. of numbers");
int n;
n=sc1.nextInt();
swap o=new swap(n);
o.read(n);
o.swap1(n);
o.display(n);
}
}

