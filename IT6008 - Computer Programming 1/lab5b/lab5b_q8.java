/**
 * lab5b_q8
 */
public class lab5b_q8 {

    public static void main(String[] args) {
        // Call the printOddNumber method with start value 7 and stop value 11
        printOddNumber(7, 11);
    }

    /**
     * This method prints all odd numbers from startValue to stopValue (inclusive).
     *
     * @param startValue The first value in the range
     * @param stopValue  The last value in the range
     */
    public static void printOddNumber(int startValue, int stopValue) {
        // Loop from startValue to stopValue (inclusive)
        for (int i = startValue; i <= stopValue; i++) {
            // If the current value is odd (i.e., not divisible by 2)
            if (i % 2 != 0) {
                // Print the current value
                System.out.println(i);
            }
        }
    }
}