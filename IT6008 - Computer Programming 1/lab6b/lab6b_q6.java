package lab6b;

import java.util.Arrays;

public class lab6b_q6 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int nb = 2;
        System.out.println(nb + " occurs " + occurrences(nb, numbers) + " times in " + Arrays.toString(numbers));
        int[] numbers2 = { 1, 1, 1, 1, 1 };
        int nb2 = 1;
        System.out.println(nb2 + " occurs " + occurrences(nb2, numbers2) + " times in " + Arrays.toString(numbers2));
    }

    public static int occurrences(int num, int[] numbers) {
        int occur = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                occur++;
            }
        }
        return occur;
    }
}
