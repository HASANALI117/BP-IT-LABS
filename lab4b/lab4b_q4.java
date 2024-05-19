public class Question4 {
    public static void getDecadeBorn(int year) {
        int decade = ((year % 100) / 10) + 1;
        System.out.println("You were born in the " + decade + "th decade of the century.");
    }

    public static void main(String[] args) {
        getDecadeBorn(1991);
    }
}
