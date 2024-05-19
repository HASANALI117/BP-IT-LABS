package lab6b;

public class lab6b_q2 {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "Ahmed";
        names[1] = "Maryam";
        names[2] = "Abdulla";
        names[3] = "Younis";
        names[4] = "Saeed";
        names[5] = "Zahra";
        names[6] = "Latifa";
        names[7] = "Philippe";
        names[8] = "Osama";
        deleteItem(names, "Philippe");
    }

    public static String[] deleteItem(String[] names, String name) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.printf("%s was not found", name);
            return names;
        }

        for (int i = index; i < names.length - 1; i++) {
            names[i] = names[i + 1];
        }
        names[names.length - 1] = null;
        System.out.printf("%s was deleted\nUpdated Array\n", name);
        for (String v : names) {
            if (v != null) {
                System.out.println(v);
            }
        }
        return names;
    }
}
