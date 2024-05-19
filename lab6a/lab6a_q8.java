package lab6a;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = { "Manama", "Sitra", "Muharraq", "AlAhli", "Riffa" };

        System.out.println("Please enter a team name");
        String userInput = in.nextLine();

        boolean foundTeam = false;
        for (String team : array) {
            if (userInput.equals(team)) {
                foundTeam = true;
            }
        }

        if (foundTeam) {
            System.out.printf("%s has won the league in the last 5 years", userInput);
        } else {
            System.out.printf("%s has NOT won the league in the last 5 years", userInput);
        }

        in.close();
    }
}
