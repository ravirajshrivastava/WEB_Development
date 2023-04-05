import java.util.Scanner;

interface Motor {
    int capacity = 100;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running");
    }

    public void consume() {
        System.out.println("Washing Machine is consuming");
    }
}

public class WashingMachine1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of Washing Machine is " + Motor.capacity);
    }
}
