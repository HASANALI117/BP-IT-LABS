/**
 * Question7
 */
public class Question7 {

    public static void main(String[] args) {
        sumOfValues(3, 12, 3);
    }

    public static void sumOfValues(int startValue, int stopValue, int step) {
        int num = 0;
        for (int i = startValue; i <= stopValue; i += step) {
            num = num + i;
        }
        System.out.println(num);
    }
}