package unit4;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int balance = 10000; // Initial balance (replace with database connection for real implementation)
        int option;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nAutomated Teller Machine");
            System.out.println("1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            option = in.nextInt();

            if (option == 1) {
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = in.nextInt();

                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful. Please collect your cash.");
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else if (option == 2) {
                System.out.print("Enter amount to deposit: ");
                int depositAmount = in.nextInt();

                balance += depositAmount;
                System.out.println("Deposit successful. Your new balance is: " + balance);
            } else if (option == 3) {
                System.out.println("Your current balance is: " + balance);
            } else if (option == 4) {
                System.out.println("Thank you for using ATM. Have a nice day!");
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }
        in.close();
    }
}
