package lab4;

import java.util.Scanner;

public class Age2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = in.nextInt();

        System.out.printf("You entered: %d\n", age);

        if (age < 21) {
            System.out.println("It's great to be young!");
        } else {
            System.out.println("Age is a state of mind!");
        }

        in.close();
    }
}
