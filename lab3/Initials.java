package lab3;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their full name
        System.out.println("Please enter your fullname:");
        
        // Read the full name from the user input
        String name = input.nextLine();
        
        // Get the first character of the name
        char firstName = name.charAt(0);
        
        // Find the index of the first space in the name
        int spaceIndex = name.indexOf(" ");
        
        // Get the character after the first space
        char lastName = name.charAt(spaceIndex+1);
        
        // Print the initials
        System.out.printf("Your initials are: %c.%c.\n",firstName,lastName );
        
        // Print the family name
        System.out.printf("Your family name is: %s\n", name.substring(spaceIndex+1));
        
        // Close the Scanner object
        input.close();
    }
}