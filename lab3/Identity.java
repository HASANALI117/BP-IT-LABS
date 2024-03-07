package lab3;
import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their full name
        System.out.println("Please enter your fullname:");
        
        // Read the full name from the user input
        String name = input.nextLine();
        
        // Print the name in uppercase
        System.out.printf("Your name in uppercase is: %s\n", name.toUpperCase());
        
        // Print the name in lowercase
        System.out.printf("Your name in lowercase is: %s\n", name.toLowerCase());
        
        // Print the length of the name
        System.out.printf("The length of your name is: %d\n", name.length());

        // Close the Scanner object
        input.close();
    }
}