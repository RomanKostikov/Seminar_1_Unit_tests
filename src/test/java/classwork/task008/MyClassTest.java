package classwork.task008;

import classwork.task008.MyClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    private static List<Integer> listNumbers1;
    private static List<Integer> listNumbers2;
    private static List<String> listWords;

    @BeforeAll
    public static void createLists() {
        listNumbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        listNumbers2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        listWords = new ArrayList<>(Arrays.asList("Hello", "World", "Seven", "Two", "Six" ));
    }

    @Test
    public void sumListShouldBeCorrect() {
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> resultTest = MyClass.sumLists(listNumbers1, listNumbers2);
        assertEquals(result, resultTest, "Сумма списков не верна!");
    }

    @Test
    public void findMaxShouldFindMaxElement() {
        int result = 3;
        int resultTest = MyClass.findMax(listNumbers1);
        assertEquals(result, resultTest, "Метод не находит наибольшее число");
    }

    @Test
    public void filterStringShouldFilterListCorrect() {
        List<String> result = new ArrayList<>(Arrays.asList("Hello", "World", "Seven"));
        List<String> resultTest = MyClass.filterStrings(listWords, 4);
        assertEquals(result, resultTest, "Метод не фильтрует лист слов по заданному условию");
    }
}
