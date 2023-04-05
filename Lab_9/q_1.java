// Write a Java class which has a method called 
// ProcessInput(). This method checks the number entered 
// by the user. If the entered number is negative then throw 
// an user defined exception called
// NegativeNumberException, otherwise it displays the 
// double value of the entered number.


import java.util.Scanner;

class NegativeNumberException extends Exception 
{
    public NegativeNumberException(String message) 
    {
        super(message);
    }
}

public class q_1 
{
    public static void ProcessInput() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) 
        {
            try 
            {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            } 
            catch (NegativeNumberException e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else 
        {
            double result = (double) num;
            System.out.println("The double value of " + num + " is " + result);
        }
    }

    public static void main(String[] args) 
    {
        ProcessInput();
    }
}