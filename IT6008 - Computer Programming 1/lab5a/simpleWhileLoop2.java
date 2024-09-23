public class simpleWhileLoop2 {
    public static void main(String[] args) {
        // Call the simpleWhileLoop method with an argument of 10
        simpleWhileLoop(10);
    }

    public static void simpleWhileLoop(int upperlimit) {
        // Initialize a counter variable i with a value of 1
        int i = 1;

        // Start a while loop that continues as long as i is less than or equal to
        // upperlimit
        while (i <= upperlimit) {
            // Print the current value of i
            System.out.println(i);

            // Increment i by 1 at each iteration
            i++;
        }
    }
}