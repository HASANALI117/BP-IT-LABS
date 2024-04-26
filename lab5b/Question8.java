/**
 * Question8
 */
public class Question8 {

    public static void main(String[] args) {
        printOddNumber(7, 11);
    }

    public static void printOddNumber(int startValue, int stopValue) {
        for (int i = startValue; i <= stopValue; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}