import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle is: %d\n", circumference);
        System.out.printf("The area of the circle is: %d\n", area);
    }
}
