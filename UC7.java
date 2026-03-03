public class UC7 {

    static class CharPattern {
        String[] pattern;
        CharPattern(String[] p) { pattern = p; }
    }

    public static void main(String[] args) {
        // Define patterns
        CharPattern O = new CharPattern(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        CharPattern P = new CharPattern(new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });
        CharPattern S = new CharPattern(new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        // Word to print
        CharPattern[] word = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 7; i++) {
            for (CharPattern c : word) {
                System.out.print(c.pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}
