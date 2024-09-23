public class lab4b_q5 {
    public static void main(String[] args) {
        XOnEitherSides("x");
    }

    public static boolean XOnEitherSides(String text) {
        // Write your code here
        if (text.length() < 1) {
            return false;
        }
        boolean hasChar = text.toLowerCase().charAt(0) == 'x' || text.toLowerCase().charAt(text.length() - 1) == 'x';

        // End of your code
        return hasChar;
    }
}
