/**
 * Question6
 */
public class Question6 {

    public static void main(String[] args) {
        products(2, 8);
    }

    public static void products(int startValue, int stopValue) {
        int num = 1;
        for (int i = startValue; i <= stopValue; i++) {
            num = num * i;
        }
        System.out.println(num);
    }
}