package lab6b;

public class Question3 {
    public static void main(String[] args) {
        int[] data = new int[] { 10, 20, -5, 100 };
        System.out.println(sumElements(data));
        data = new int[] {};
        System.out.println(sumElements(data));
    }

    public static int sumElements(int[] data) {
        int total = 0;
        int index = 0;
        while (index < data.length) {
            total += data[index];
            index++;
        }
        return total;
    }
}
