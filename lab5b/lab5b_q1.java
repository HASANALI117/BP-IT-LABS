import java.text.DecimalFormat;
import java.util.Scanner;

public class lab5b_q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double bdNum = 0;
        System.out.println("BD to EUR converter");
        do {
            System.out.println("Please enter amount (-99 to quit):");
            bdNum = input.nextDouble();
            if (bdNum != -99) {
                double euroNum = bdNum * 1.85;
                System.out.printf("%sBD is equal to %sEuros\n", df.format(bdNum), df.format(euroNum));
            }
        } while (bdNum != (int) -99);
        input.close();
    }
}