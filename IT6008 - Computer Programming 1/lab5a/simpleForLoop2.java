public class simpleForLoop2 {
    public static void main(String[] args) {
        // Call the simpleForLoop method with an argument of 10
        simpleForLoop(10);
    }

    public static void simpleForLoop(int upperlimit) {
        // Start a for loop with a counter i initialized to 1
        // The loop continues as long as i is less than or equal to upperlimit
        // i is incremented by 1 at each iteration
        for (int i = 1; i <= upperlimit; i++) {
            // Print the current value of i
            System.out.println(i);
        }
    }
}