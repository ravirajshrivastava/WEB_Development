// WAP to design a calculator which receive <first number> 
// <operator> <second number> from command line and display result.

import java.util.Scanner;

public class q_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operator");
        char op = sc.next().charAt(0);                //what is charAt ????? What is the use????
        
        int result = 0;
        switch(op){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result is " + result);
    }
}