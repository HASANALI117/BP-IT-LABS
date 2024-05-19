import java.util.Scanner;

/**
 * Question3
 */
public class Question3 {
    // Create a Scanner object for user input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // calculateNbTeams(25, 5);
        // Call the method to enter the team size
        enterTeamSize();
    }

    // Method to form groups
    public static int formGroups() {
        int totalStudents;
        // Loop until a valid number of students is entered
        do {
            // Prompt for the number of students
            System.out.println("How many students are in the group?");
            totalStudents = input.nextInt();
            // If the number of students is less than 1, print an error message
            if (totalStudents < 1) {
                System.out.println("Error: total number of students must be positive");
            }
        } while (totalStudents < 1);

        // Return the number of students
        return totalStudents;
    }

    // Method to enter the team size
    public static int enterTeamSize() {
        int teamSize;
        // Loop until a valid team size is entered
        do {
            // Prompt for the team size
            System.out.println("How many students should be in each team?");
            teamSize = input.nextInt();
            // If the team size is not between 2 and 5, print an error message
            if (teamSize < 2 || teamSize > 5) {
                System.out.println("Error: team size must be between 2 and 5");
            }
        } while (teamSize < 2 || teamSize > 5);
        // Return the team size
        return teamSize;
    }

    // Method to calculate the number of teams and the number of students without a
    // team
    public static void calculateNbTeams(int totalStudents, int teamSize) {
        // Calculate the number of teams
        int num1 = totalStudents / teamSize;
        // Calculate the number of students without a team
        int num2 = totalStudents % teamSize;
        // Print the number of teams
        System.out.printf("There will be %d teams\n", num1);
        // Print the number of students without a team
        System.out.printf("There will be %d students who have no team\n", num2);
    }
}