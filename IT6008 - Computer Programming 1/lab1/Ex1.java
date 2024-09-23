package lab1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your country of birth:");
        String country = input.nextLine();
        System.out.printf("Hi %s, you're %d and born in %s", name, age, country);
    }
}
