public class Question3 {
    public static void printReversedOrder(int input) {
        if (input < 100 || input > 999) {
            System.out.println("incorrect input.");
            return;
        }
        int reverse = (input % 10 * 100) + (input % 100 / 10 * 10) + (input % 1000 / 100);
        System.out.printf("%d reversed is %d.", input, reverse);
    }

    public static void main(String[] args) {
        printReversedOrder(123);
    }
}
