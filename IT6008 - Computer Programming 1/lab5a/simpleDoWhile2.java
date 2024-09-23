public class simpleDoWhile2 {
    public static void main(String[] args) {
        // Call the simpleDoWhile method with an argument of 10
        simpleDoWhile(10);
    }

    public static void simpleDoWhile(int upperlimit) {
        // Initialize a counter variable i with a value of 0
        int i = 0;

        // Start a do-while loop
        do {
            // Increment i by 1 at each iteration
            i++;

            // Print the current value of i
            System.out.println(i);

            // Continue the loop as long as i is less than upperlimit
        } while (i < upperlimit);
    }
}