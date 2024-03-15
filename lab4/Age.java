package lab4;

import java.util.Scanner;

/**
 * Age
 */
public class Age {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = in.nextInt();

        System.out.printf("You entered: %d\n", age);

        if (age < 21) {
            System.out.println("It's great to be young!");
        }

        in.close();
    }
}