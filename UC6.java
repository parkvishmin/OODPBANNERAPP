public class UC6 {

    static String[] O = {
        " *** ",
        "*   *",
        "*   *",
        "*   *",
        "*   *",
        "*   *",
        " *** "
    };

    static String[] P = {
        "**** ",
        "*   *",
        "*   *",
        "**** ",
        "*    ",
        "*    ",
        "*    "
    };

    public static void main(String[] args) {
        // Print O O P
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i]);
        }
    }
}
