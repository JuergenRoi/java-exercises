import java.util.*;

public class MajorElement {
    public static int majorElement(int[] numbers) {
        Map<Integer,Integer> map = new HashMap<>();
        int element = numbers.length / 2;

        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);

            if (map.get(number) > element){
                return number;
            } 
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 2, 3, 3};

        System.out.println(majorElement(array1));
    }
}
