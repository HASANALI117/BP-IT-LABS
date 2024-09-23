package lab6b;

public class lab6b_q4 {
    public static void main(String[] args) {
        System.out.println(findFirst(new int[] { 10, 20, 30, 50, 40, 30 }, 30));
    }

    public static int findFirst(int[] vector, int value) {
        int i = 0;
        while (i < vector.length) {
            if (vector[i] == value) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
