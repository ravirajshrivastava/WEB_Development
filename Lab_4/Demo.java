/*Write a class file – box with three data members(length, width, height) and a 
method volume() . Also implement the application class Demo where an object of 
the box class is created with user entered dimensions and volume is printed. */


import java.util.Scanner;
// import java.util.*;
import java.util.*;

class Box {
    int length, width, height;

    void volume() {
        System.out.println("Volume of the box is: " + length * width * height);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        System.out.println("Enter the length, width and height of the box: ");
        b.length = sc.nextInt();
        b.width = sc.nextInt();
        b.height = sc.nextInt();
        b.volume();
    }
}