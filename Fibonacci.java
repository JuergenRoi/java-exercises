public class Fibonacci {
    public static void fibonacci(int number) {
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

    public static void main(String[] args) {
        fibonacci(10);
    }
}
