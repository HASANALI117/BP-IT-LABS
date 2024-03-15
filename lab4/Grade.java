package lab4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your exam mark");
        int mark = in.nextInt();

        if (mark >= 0 && mark <= 59) {
            System.out.println("Your grade is D");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Your grade is C");
        } else if (mark >= 70 && mark <= 84) {
            System.out.println("Your grade is B");
        } else if (mark >= 85 && mark <= 100) {
            System.out.println("Your grade is A");
        }
        in.close();
    }
}
