package lab3;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.println("Please enter your name:");
        
        // Read the name from the user input
        String name = input.nextLine();
        
        // Prompt the user to enter their age
        System.out.println("Please enter your age:");
        
        // Read the age from the user input
        int age = input.nextInt();
        
        // Consume the newline left-over
        input.nextLine();
        
        // Prompt the user to enter their country of birth
        System.out.println("Please enter your country of birth:");
        
        // Read the country from the user input
        String country = input.nextLine();
        
        // Print a message to the user
        System.out.printf("Hi %s, you're %d and born in %s", name, age, country);
        
        // Close the Scanner object
        input.close();
    }
}