package lab3;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an ISBN in the format x-xxx-xxxxx-x
        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x:");
        
        // Read the entire line of input
        String isbn = input.nextLine();

        // Create another Scanner object with the delimiter set to "-"
        // This will split the input string at each "-"
        Scanner sc = new Scanner(isbn).useDelimiter("-");
        
        // Read each part of the ISBN as an integer
        int language = sc.nextInt();
        int publisher = sc.nextInt();
        int book = sc.nextInt();
        int check = sc.nextInt();
        
        // Print each part of the ISBN
        System.out.printf("Language is: %s\n", language);
        System.out.printf("Publisher is: %s\n", publisher);
        System.out.printf("Book is: %s\n", book);
        System.out.printf("Check is: %s\n", check);
        
        // Close the Scanner objects
        sc.close();
        input.close();
    }
}