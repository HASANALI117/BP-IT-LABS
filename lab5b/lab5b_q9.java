/**
 * Question9
 */
public class Question9 {

    public static void main(String[] args) {
        // Call the drawStars method with n value 5
        drawStars(5);
    }

    /**
     * This method prints a pattern of stars. Each line contains one more star than
     * the line before it.
     *
     * @param n The number of lines of stars to print
     */
    public static void drawStars(int n) {
        if (n < 1) {
            System.out.println("Invalid input");
        }
        // Loop from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // For each line, print i stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // After printing the stars, print a newline
            System.out.println("");
        }
    }
}