public class Question7 {
    public static void main(String[] args) {
        isWithin(-11);
    }

    // Script to find if x is inside closed interval [-10, 0]
    static void isWithin(int x) {
        System.out.println((x >= -10 && x < 1) ? true : false);
    }
}
