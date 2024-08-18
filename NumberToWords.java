public class NumberToWords {

    private static final String[] ONES = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
        "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] OTHERS = {
        "", "Thousand", "Million", "Billion"
    };

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + OTHERS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return ONES[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return ONES[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        int n1 = 438237764;
        int n2 = 1001;
        int n3 = 123456;

        System.out.println(n1 + " in words: " + numberToWords(n1));
        System.out.println(n2 + " in words: " + numberToWords(n2));
        System.out.println(n3 + " in words: " + numberToWords(n3));
    }
}
