public class Sum {
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            System.out.println("Digit: " + digit);
            sum = sum + digit;
            System.out.println("Sum: " + sum);
            number = number / 10;
            System.out.println("Number: " + number);
            System.out.println("-----");
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of all digits: " + calculateSumOfDigits(125));
    }
}
