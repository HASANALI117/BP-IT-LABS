/**
 * printDescendingOrder
 */
public class lab4b_q2 {

    // Method to sort the numbers in descending order
    public static void printDescendingOrder(int int1, int int2, int int3) {
        // Initialize an array with the input integers
        int[] list = { int1, int2, int3 };

        // Loop through each element in the array
        for (int i = 0; i < list.length; i++) {
            // For each element, loop through the rest of the array
            for (int j = i + 1; j < list.length; j++) {
                // If the current element is less than the next element, swap them
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        print(list[0], list[1], list[2]);
    }

    // Method to print the values in descending order
    public static void print(int value1, int value2, int value3) {
        System.out.println("Values in descending order are: " + value1 + " " + value2 + " " + value3 + ".");
    }

    public static void main(String[] args) {
        // Call the method with some test numbers
        printDescendingOrder(3, 5, 8);
    }
}