package lab3;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the circle
        System.out.println("Please enter the radius of the circle:");
        
        // Read the radius from the user input
        double radius = input.nextDouble();
        
        // Calculate the area of the circle using the formula PI*r^2
        double area = Math.PI * Math.pow(radius, 2);
        
        // Calculate the circumference of the circle using the formula 2*PI*r
        double circumference = 2 * Math.PI * radius;
        
        // Print the circumference and area of the circle
        System.out.printf("The circumference of the circle is: %.2f\n", circumference);
        System.out.printf("The area of the circle is: %.2f\n", area);
        
        // Close the Scanner object
        input.close();
    }
}