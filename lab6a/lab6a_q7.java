package lab6a;

public class Question7 {
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 3, 4, 5 };
        System.out.println(check(numbers));
    }

    public static int check(int[] aiNumbers) {

        int val = aiNumbers[0];
        for (int iLoop = 1; iLoop < aiNumbers.length; iLoop++) {
            if (aiNumbers[iLoop] < val) {
                val = aiNumbers[iLoop];
            }
        }
        return val;

    }
}
