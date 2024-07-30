import java.util.*;

public class ReverseString {
    public void reverseStringV1(String input) {
        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; --i) {
            char c = input.charAt(i);
            reversedString += c;
        }

        System.out.println(reversedString);
    }

    public void reverseStringV2(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(input);
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ReverseString reverseString = new ReverseString();
            System.out.print("Input Original String: ");
            String originalString = scanner.nextLine();   

            System.out.print("Reversed String using for-loop: ");
            reverseString.reverseStringV1(originalString);
    
            System.out.print("Reversed String using StringBuilder: ");
            reverseString.reverseStringV2(originalString);
        }
    }
}
