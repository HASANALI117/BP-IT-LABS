/**
 * Question7
 */
public class Question7 {

    public static void main(String[] args) {
        // Call the sumOfValues method with start value 3, stop value 12, and step 3
        sumOfValues(3, 12, 3);
    }

    /**
     * This method calculates the sum of all integers from startValue to stopValue
     * (inclusive),
     * incrementing by the step value each time, and prints the result.
     *
     * @param startValue The first value in the range
     * @param stopValue  The last value in the range
     * @param step       The increment for each step in the range
     */
    public static void sumOfValues(int startValue, int stopValue, int step) {
        int num = 0; // Initialize the sum to 0

        // Loop from startValue to stopValue (inclusive), incrementing by step each time
        for (int i = startValue; i <= stopValue; i += step) {
            num = num + i; // Add the current value to the sum
        }

        // Print the final sum
        System.out.println(num);
    }
}