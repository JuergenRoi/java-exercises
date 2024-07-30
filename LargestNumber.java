import java.util.*;

public class LargestNumber {
    public int largestNumberUsingStreams(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        return max;
    }

    public int largestNumberUsingSort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public int largestNumberUsingCollections(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        return Collections.max(list);
    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        int[] array1 = {10, 324, 45, 90, 9808};

        System.out.println("The largest number using Streams: " + largestNumber.largestNumberUsingStreams(array1));
        System.out.println("The largest number using Sort: " + largestNumber.largestNumberUsingSort(array1));
        System.out.println("The largest number using Collections: " + largestNumber.largestNumberUsingCollections(array1));
    }
}
