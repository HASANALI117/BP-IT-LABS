import java.util.Scanner;

public class Calculator {

    // static Scanner; scanner input can be used in multiple methods
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. call readNumber() to read number from user and store in num1 and num2
        int num1 = readNumber();
        int num2 = readNumber();

        add(num1, num2);

        // 5. call subtract and multiply method passing num1 and num2
        subtract(num1, num2);
        multiply(num1, num2);
    }

    // Method to read input (number) from user
    public static int readNumber() {
        System.out.print("Enter a number: \n");
        return input.nextInt();
    }

    // 2. Write a method (name: add) to print the sum of two numbers passed as
    // parameters
    public static void add(int int1, int int2) {
        int sum = int1 + int2;
        System.out.println("Sum is: " + sum);
    }

    // 3. Write a method (name: subtract) to print the difference of two numbers
    // passed as paramters
    public static void subtract(int int1, int int2) {
        int difference = int1 - int2;
        System.out.println("Difference is: " + difference);
    }

    // 4. Write a method (name: multiply) to print the product of two numbers passed
    // as paramters
    public static void multiply(int int1, int int2) {
        int product = int1 * int2;
        System.out.println("Product is: " + product);
    }
}
