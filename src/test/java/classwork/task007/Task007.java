package classwork.task007;

public class Task007 {
    /*
    Попробуем сделать наш код более надежным, предотвратив переполнение переменной.
Исправьте метод сложения двух чисел так, чтобы при переполнении переменной выбрасывалось
предупреждение.
     */
    public static void main(String[] args) {
        sum(1234567890, 1000000000);
    }

    public static int sum(int a, int b) {
        long result = (long) a + b;
        System.out.println(result);
        assert result < Integer.MAX_VALUE : "Переполнение переменной";
        return a + b;
    }

}
