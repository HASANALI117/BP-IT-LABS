import java.util.Scanner;

/**
 * Question5
 */
public class Question5 {

    public static void main(String[] args) {
        menu(); // Call the menu method
    }

    public static void menu() {
        Scanner input = new Scanner(System.in); // Create a new Scanner object for user input
        String pass = "pwd123"; // The correct password
        String inputPass; // The password entered by the user
        boolean isPasswordCorrect = false; // Whether the entered password is correct
        boolean isChoiceExit = false; // Whether the user has chosen to exit

        do {
            System.out.println("Enter your password");
            inputPass = input.nextLine(); // Get the password from the user
            if (inputPass.equals(pass)) { // If the entered password is correct
                isPasswordCorrect = true; // Set isPasswordCorrect to true
                int choice; // The user's menu choice
                do {
                    System.out.println("1. Choice 1\n2. Choice 2\n3. Choice 3\n4. Exit"); // Print the menu
                    choice = input.nextInt(); // Get the user's menu choice
                    switch (choice) { // Switch on the user's menu choice
                        case 1:
                            System.out.println("You have entered choice 1"); // If the choice was 1
                            break;
                        case 2:
                            System.out.println("You have entered choice 2"); // If the choice was 2
                            break;
                        case 3:
                            System.out.println("You have entered choice 3"); // If the choice was 3
                            break;
                        case 4:
                            isChoiceExit = true; // If the choice was 4 (exit)
                            break;

                        default:
                            System.out.println("You have entered an invalid choice"); // If the choice was not 1, 2, 3,
                                                                                      // or 4
                            break;
                    }
                } while (!isChoiceExit); // Repeat until the user chooses to exit
            } else {
                System.out.println("Invalid password"); // If the entered password was not correct
            }

        } while (!isPasswordCorrect); // Repeat until the correct password is entered
        input.close(); // Close the Scanner
    }
}