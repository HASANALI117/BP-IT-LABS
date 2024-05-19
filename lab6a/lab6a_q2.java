package lab6a;

public class Question2 {
    public static void main(String[] args) {
        String[] array = { "Manama", "Sitra", "Muharraq", "AlAhli", "Riffa" };
        for (String string : array) {
            System.out.println(string);
        }
        array[3] = "Nuwaidrat";
        for (String string : array) {
            System.out.println(string);
        }
    }
}
