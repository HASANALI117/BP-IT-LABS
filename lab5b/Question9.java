/**
 * Question9
 */
public class Question9 {

    public static void main(String[] args) {
        drawStars(5);
    }

    public static void drawStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}