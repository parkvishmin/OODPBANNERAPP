import java.util.HashMap;
import java.util.Map;

public class UC8 {

    static void displayBanner(String word, Map<Character, String[]> patterns) {
        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c)[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = new HashMap<>();
        patterns.put('O', new String[]{
            " *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "
        });
        patterns.put('P', new String[]{
            "**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "
        });
        patterns.put('S', new String[]{
            " ****", "*    ", "*    ", " *** ", "    *", "    *", "**** "
        });

        displayBanner("OOPS", patterns);
    }
}
