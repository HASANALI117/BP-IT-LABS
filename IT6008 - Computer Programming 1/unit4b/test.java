package unit4b;

/**
 * test
 */
public class test {
    public static int x = 10;

    public static void main(String[] args) {
        System.out.println("print " + x);
        int f = sum(1, 2);
        System.out.println(f);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void name() {
        System.out.println("Name");
    }

}