package Lab_5;
import java.util.*;

public class Quick_sort 
{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int i, int j) 
{
    int pivot = arr[j]; // Choose the rightmost element as pivot
    i = i - 1; // Index of smaller element

    for (j = i; j <= j - 1; j++) 
    {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot) 
        {
            i++; // Increment index of smaller element
            swap(arr, i, j); // Swap elements at i and j
        }
    }
    swap(arr, i + 1, j); // Swap pivot with the element at i+1
    return i + 1; // Return the index of pivot
}

private static void swap(int[] arr, int i, int j) 
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    // static int partition(int[] arr, int start,)
    // {
    //     int i,j;
    //     int pivot = arr[start];
    //     i = start;
    //     j = end+1;
    //     while(i<j)
    //     {
    //         do
    //         {
    //             if(i ==end)
    //             break;
                
    //             ++i;
    //         }
    //         while(arr[i] <= pivot);

    //         if(i<j)
    //         {

    //         }
    //     }
    // }   
}
