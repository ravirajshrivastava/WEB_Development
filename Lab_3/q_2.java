/*WAP to accept 10 numbers from command line and check how 
many of them are even and how many odd.*/

import java.util.*; 
public class q_2 {
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
	int ctr_even = 0, ctr_odd = 0;
    System.out.println("Enter the 10 numbers");
    for(int i=0; i<10; i++)
    {
        arr[i]=sc.nextInt();
    }
	// System.out.println("Original Array: "+Arrays.toString(nums)); 
	for(int i = 0; i < arr.length; i++) {
    if(arr[i] % 2 == 0)
	{
        ctr_even++;
	}
	else
	ctr_odd++;	
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",ctr_even, ctr_odd);
	System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
	System.out.printf("\n");	
  }
}