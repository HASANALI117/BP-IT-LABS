package lab6b;

public class Question5 {
    public static void main(String[] args) {
        String[] words = { "Philippe", "Osama", "David", "Abdulmonem" };
        System.out.println("longest string is: " + longestString(words));
        String[] words2 = { "IT6008" };
        System.out.println("longest string is: " + longestString(words2));
        String[] words3 = { "long", "new", "null", "package", "private", "public", "return", "short", "static" };
        System.out.println("longest string is: " + longestString(words3));
    }

    public static String longestString(String[] names) {
        String longest = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        return longest;
    }
}
