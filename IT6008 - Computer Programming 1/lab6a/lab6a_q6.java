package lab6a;

public class lab6a_q6 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        check(numbers);
    }

    public static boolean check(int[] iNumbers) {

        boolean bValid = true;
        for (int i = 0; i < iNumbers.length - 1; i++) {
            if (iNumbers[i] >= iNumbers[i + 1]) {
                bValid = false;
            }
        }
        return bValid;
    }
}
