import java.text.DecimalFormat;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        convert();
    }

    // This method starts the program and provides the menu
    public static void convert() {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("BD to EUR converter");
        double bdNum = 0;
        do {
            System.out.println("Please enter amount (-99 to quit):");
            bdNum = input.nextDouble();
            if (bdNum != -99) {
                convert2euro(bdNum);
                System.out.printf("%sBD is equal to %s Euros\n", df.format(bdNum), df.format(convert2euro(bdNum)));
            }
        } while (bdNum != (int) -99);

        input.close();
    }

    // This method is used to complete the currency conversion
    public static double convert2euro(double bd) {
        double euroNum = bd * 1.85;
        return euroNum;
    }
}
