import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Declare an integer variable i to store the user's input
        int i;

        // Initialize a variable sum to 0 to store the sum of even numbers
        int sum = 0;

        // Start a do-while loop
        do {
            // Prompt the user to enter a number
            System.out.println("Enter a number (0 to quit): ");

            // Read the user's input
            i = in.nextInt();

            // If the input number is even, add it to the sum
            if (i % 2 == 0) {
                sum += i;
            }
            // Continue the loop as long as the input number is not 0
        } while (i != 0);

        // Print the sum of even numbers
        System.out.printf("The sum of even numbers is %d", sum);

        in.close();
    }
}