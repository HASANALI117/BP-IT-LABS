package lab4;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter password: ");

        String inPass = in.nextLine();
        final String pass = "C0RR3CT";

        if (inPass.equals(pass)) {
            System.out.println("You have gained access to the system!");
        } else {
            System.out.println("Your password is incorrect!");
        }

        in.close();
    }
}
