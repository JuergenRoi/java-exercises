import java.util.*;

public class Numbers {
    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Number: ");
            int input = scanner.nextInt();
    
            System.out.println("Is Prime Number?: " + isPrimeNumber(input));
            System.out.println("Is Odd Number?: " + isOdd(input));
            System.out.println("Is Positive Number?: " + isPositive(input));
            System.out.println("Factorial: " + factorial(input));   
        }
    }
}
