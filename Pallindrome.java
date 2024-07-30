public class Pallindrome {
    public static void palindromeV1(String input) {
        String originalString = input.replaceAll("[\\W_]", "").toLowerCase();
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; --i) {
            char c = originalString.charAt(i);
            reversedString += c;
        }

        if (originalString.equals(reversedString.toLowerCase())) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    public static void palindromeV2(String input) {
        String processString = input.replaceAll("[\\W_]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(processString);

        String reverservedString = stringBuilder.reverse().toString();

        if (processString.equals(reverservedString)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    public static void main(String[] args) {
        palindromeV1("Was it a car or a cat I saw?");
        palindromeV1("A man, a plan, a canal, Panama");
        palindromeV1("WATUSI");

        palindromeV2("Was it a car or a cat I saw?");
        palindromeV2("A man, a plan, a canal, Panama");
        palindromeV2("WATUSI");
    }
}
