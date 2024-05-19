package lab1;

import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fullname:");
        String name = input.nextLine();
        System.out.printf("Your name in uppercase is: %s\n", name.toUpperCase());
        System.out.printf("Your name in lowercase is: %s\n", name.toLowerCase());
        System.out.printf("The length of your name is: %d\n", name.length());
    }
}
