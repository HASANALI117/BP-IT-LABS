import java.util.Scanner;

/**
 * Question5
 */
public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "pwd123";
        String inputPass;
        do {
            System.out.println("Enter your password");
            inputPass = input.nextLine();
            if (inputPass.equals(pass)) {
                int choice;
                do {
                    System.out.println("1. Choice 1\n2. Choice 2\n3. Choice 3\n4. Exit");
                    choice = input.nextInt();
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
                            break;

                        default:
                            System.out.println("You have entered an invalid choice");
                            break;
                    }
                } while (choice != 4);
            } else {
                System.out.println("Invalid password");
            }

        } while (!inputPass.equals(pass));
        input.close();
    }
}