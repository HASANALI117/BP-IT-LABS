package lab6b;

import java.util.Scanner;

public class lab6b_q1 {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "Ahmed";
        names[1] = "Maryam";
        names[2] = "Abdulla";
        names[3] = "Younis";
        names[4] = "Saeed";
        names[5] = "Zahra";
        names[6] = "Latifa";
        addName(names);
    }

    public static String[] addName(String[] names) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i] == null) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Array full");
                break;
            } else {
                System.out.println("Add a student name");
                String name = input.nextLine();
                names[index] = name;
                System.out.println("Name added successfully. Add another? Enter y or n");
                String response = input.nextLine();
                if (!response.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
        System.out.println("Updated Array");
        for (String v : names) {
            if (v != null) {
                System.out.println(v);
            }
        }
        return names;
    }
}
