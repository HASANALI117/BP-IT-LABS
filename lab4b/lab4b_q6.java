public class lab4b_q6 {
    public void main(String[] args) {
        int x = 1;
        System.out.println(isXOdd(x));
    }

    // method to check whether x is odd
    boolean isXOdd(int x) {
        return x % 2 != 0;
    }

    // Another solution:
    // boolean isXOdd(int x) {
    // return (x % 2 == 0) ? false : true;
    // }
}
