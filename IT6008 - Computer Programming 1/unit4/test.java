package unit4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int balance = 100;
        int option;
        Scanner input = new Scanner(System.in);

        boolean cont = true;
        while (cont) {
            System.out.println(
                    "\nAutomated Teller Machine\n1. Withdraw Cash\n2. Deposit Cash\n3. Check Balance\n4. Exit\nEnter your choice: ");
            option = input.nextInt();
            if (option == 1) {
                System.out.println("enter amount to withdraw: ");
                int withdrawalAmount = input.nextInt();
                balance -= withdrawalAmount;
                System.out.printf("Withdrawal successful. Your balance is %d.\n", balance);
            } else if (option == 4) {
                cont = false;
            }
        }
        input.close();
    }
}
