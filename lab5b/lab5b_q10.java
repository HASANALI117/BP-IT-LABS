/**
 * lab5b_q10
 */
public class lab5b_q10 {

    public static void main(String[] args) {
        drawStars(5, false);
    }

    /**
     * Method to draw a pattern of stars.
     *
     * @param n            The number of rows in the pattern.
     * @param isUpSideDown If true, the pattern is drawn upside down.
     */
    public static void drawStars(int n, boolean isUpSideDown) {
        if (n < 1) {
            System.out.println("Invalid input");
        }
        // Loop over each row
        for (int i = 0; i <= n; i++) {
            // Calculate the number of stars in the current row
            // If isUpSideDown is true, the number of stars decreases as i increases
            // If isUpSideDown is false, the number of stars increases as i increases
            // Loop over each column in the current row
            for (int j = 0; j < (isUpSideDown ? n - i : i); j++) {
                // Print a star
                System.out.print("*");
            }
            // Move to the next line
            System.out.println("");
        }
    }

    // Another solution:

    // public static void drawStars(int n, boolean isUpSideDown) {
    // if (isUpSideDown) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = n; j >= i; j--) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }
    // } else {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }
    // }
    // }

}