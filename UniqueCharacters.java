public class UniqueCharacters {
    public static boolean hasAllUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAllUniqueChars("abcdef"));
        System.out.println(hasAllUniqueChars("aabbcc"));
    }
}
