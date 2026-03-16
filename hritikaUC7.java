public class hritikaUC7 {
    // Inner class
    static class CharacterPatternMap {

        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String[] oPattern = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] pPattern = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] sPattern = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        CharacterPatternMap o1 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap o2 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap p = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap s = new CharacterPatternMap('S', sPattern);

        CharacterPatternMap[] banner = {o1, o2, p, s};

        for (int i = 0; i < oPattern.length; i++) {
            for (CharacterPatternMap cp : banner) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}
