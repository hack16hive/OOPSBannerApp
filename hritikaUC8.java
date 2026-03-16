import java.util.HashMap;

public class hritikaUC8 {
   public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = charMap.get('O').length;

        for (int i = 0; i < height; i++) {

            for (char c : message.toCharArray()) {

                String[] pattern = charMap.get(c);
                System.out.print(pattern[i] + "  ");

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);

    } 
}
