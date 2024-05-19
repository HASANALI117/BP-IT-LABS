package lab6b;

import java.util.Arrays;

public class lab6b_q7 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Average of " + Arrays.toString(numbers) + " is " + average(numbers));
        int[] numbers2 = { 1, 5, 3, 4, 1 };
        System.out.println("Average of " + Arrays.toString(numbers2) + " is " + average(numbers2));
        int[] numbers3 = { 1, 1, 1, 1, 1 };
        System.out.println("Average of " + Arrays.toString(numbers3) + " is " + average(numbers3));
    }

    public static double average(int[] numbers) {
        double avg = 0;
        for (int i : numbers) {
            avg += i;
        }
        avg /= numbers.length;
        return avg;
    }
}
