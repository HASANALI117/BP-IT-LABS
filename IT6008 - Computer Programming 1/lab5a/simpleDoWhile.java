public class simpleDoWhile {
    public static void main(String[] args) {
        // Initialize a counter variable i with a value of 1
        int i = 1;

        // Declare a constant j with a value of 10
        final int j = 10;

        // Start a do-while loop
        do {
            // Print the current value of i
            System.out.println(i);

            // Increment i by 1 at each iteration
            i++;

            // Continue the loop as long as i is less than or equal to j
        } while (i <= j);
    }
}