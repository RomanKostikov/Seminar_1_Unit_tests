package classwork.task008;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
    public static List<Integer> sumLists(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("—писки должны быть одинаковой длины");
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
        }

        return result;
    }

    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("—писок не должен быть пустым");
        }

        int max = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static List<String> filterStrings(List<String> words, int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("ћинимальна€ длина не может быть отрицательной");
        }

        return words.stream()
                .filter(word -> word.length() >= minLength)
                .collect(Collectors.toList());
    }
}
