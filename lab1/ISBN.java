package lab1;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle is: %s\n", circumference);
    }
}
