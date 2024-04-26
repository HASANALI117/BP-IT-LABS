/**
 * Question6
 */
public class Question6 {

    public static void main(String[] args) {
        // Call the products method with start value 2 and stop value 8
        products(2, 8);
    }

    /**
     * This method calculates the product of all integers from startValue to
     * stopValue (inclusive)
     * and prints the result.
     *
     * @param startValue The first value in the range
     * @param stopValue  The last value in the range
     */
    public static void products(int startValue, int stopValue) {
        int num = 1; // Initialize the product to 1

        // Loop from startValue to stopValue (inclusive)
        for (int i = startValue; i <= stopValue; i++) {
            num = num * i; // Multiply the current product by the current value
        }

        // Print the final product
        System.out.println(num);
    }
}