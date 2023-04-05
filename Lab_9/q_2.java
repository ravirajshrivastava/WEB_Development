// Write a java program to create Account with 500 rupee 
// minimum balance, deposit amount, withdraw amount and 
// also throws LessBalanceException which returns the 
// statement that says withdraw amount is not valid.

import java.util.Scanner;

class LessBalanceException extends Exception 
{
    public LessBalanceException(String message) 
    {
        super(message);
    }
}

class Account 
{
    int min_balance = 500;

    void deposit(int amount) 
    {
        min_balance += amount;
        System.out.println(amount + " rupees deposited.");
    }

    void withdraw(int amount) throws LessBalanceException 
    {
        if (min_balance - amount < 500)
        {
            throw new LessBalanceException("Withdraw amount is not valid.");
        }
        else
        {
            min_balance -= amount;
            System.out.println(amount + " rupees withdrawn.");
        }
    }

    void checkBalance() 
    {
        System.out.println("Your balance is " + min_balance + " rupees.");
    }
}

public class q_2 
{
    public static void main(String[] args) 
    {
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount: ");
        int depositAmount = sc.nextInt();
        acc.deposit(depositAmount);

        System.out.println("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();
        try 
        {
            acc.withdraw(withdrawAmount);
        }
        catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage());
        }

        acc.checkBalance();
    }
}

