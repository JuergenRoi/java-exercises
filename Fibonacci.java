public class Fibonacci {
    public static void fibonacciV1(int number) {
        int first = 0;
        int second = 1;
        int next;

        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    public static int fibonacciV2(int number) {
        if (number <= 1) {
            return number;
        }
        
        return fibonacciV2(number - 1) + fibonacciV2(number - 2);
    }

    public static void main(String[] args) {
        int number = 10;

        //fibonacciV1(number);

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciV2(i) + " ");
        }
    }
}
