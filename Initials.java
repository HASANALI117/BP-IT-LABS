import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fullname:");
        String name = input.nextLine();
        char firstName = name.charAt(0);
        int spaceIndex = name.indexOf(" ");
        char lastName = name.charAt(spaceIndex+1);
        System.out.printf("Your initials are: %c.%c.\n",firstName,lastName );
        System.out.printf("Your family name is: %s\n", name.substring(spaceIndex));
    }
}
