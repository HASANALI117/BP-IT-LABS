import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        // Create a new Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Define the correct password
        String pass = "pwd123";
        // Variable to hold the user's password input
        String inputPass;
        // Boolean variable to track whether the entered password is correct
        boolean isPasswordCorrect = false;
        // Do-while loop that continues until the correct password is entered
        do {
            // Prompt the user to enter their password
            System.out.println("Enter your password");
            // Get the user's password input
            inputPass = input.nextLine();
            // Check if the entered password is correct
            if (inputPass.equals(pass)) {
                // If the password is correct, set isPasswordCorrect to true
                isPasswordCorrect = true;
                // Display the menu options
                System.out.println("1. Choice 1\n2. Choice 2\n3. Choice 3\n4. Choice 4");
                // Get the user's menu choice
                int choice = input.nextInt();
                // Switch statement to handle the user's menu choice
                switch (choice) {
                    case 1:
                        System.out.println("You have entered choice 1");
                        break;
                    case 2:
                        System.out.println("You have entered choice 2");
                        break;
                    case 3:
                        System.out.println("You have entered choice 3");
                        break;
                    case 4:
                        System.out.println("You have entered choice 4");
                        break;
                    default:
                        // If the user enters an invalid choice, display an error message
                        System.out.println("You have entered an invalid choice");
                        break;
                }
            } else {
                // If the password is incorrect, display an error message
                System.out.println("Invalid password");
            }
            // Continue the loop until the correct password is entered
        } while (!isPasswordCorrect);
        // Close the Scanner object
        input.close();
    }
}
