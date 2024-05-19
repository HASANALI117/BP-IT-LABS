package lab6a;

public class Question9 {
    public static void main(String[] args) {
        String students[] = { "John", "Maryam", "Fatema", "Paul", "Zainab", "Mary", "Ahmed", "Peter", "Hussain",
                "Sayed Hussain" };
        double grades[] = { 52.4, 67.9, 87.3, 45.2, 77.8, 93.6, 83.9, 62.7, 68.9, 78.2 };
        searchHighest(students, grades);
        System.out.println("The class average is: " + average(students, grades));
    }

    public static void searchHighest(String[] students, double[] grades) {
        double score = 0;
        String student = "";
        for (int i = 0; i < grades.length; i++) {
            if (score < grades[i]) {
                score = grades[i];
                student = students[i];
            }
        }
        System.out.printf("%s got the highest grades of the class: %.1f\n", student, score);
    }

    public static double average(String[] students, double[] grades) {
        double ave = 0;
        for (int i = 0; i < grades.length; i++) {
            ave += grades[i];
        }
        ave = ave / grades.length;
        return ave;
    }
}
