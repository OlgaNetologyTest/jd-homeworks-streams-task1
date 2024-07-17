package streamsHW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(16);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(32);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(23);
        numbers.add(4);

        System.out.println("Исходные числа: " + numbers);

        List<Integer> positiveNumbers = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        System.out.println("Положительные числа:" + positiveNumbers);

        List<Integer> evenNumbers = positiveNumbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Четные числа: " + evenNumbers);

        evenNumbers.sort(Comparator.naturalOrder());

        System.out.println("Отсортированные числа: " + evenNumbers);
    }
}
