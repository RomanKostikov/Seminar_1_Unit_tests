package classwork.task005;

public class Task005 {
    public static void main(String[] args) {
        assertConditionA();
    }

    /*
    Давайте представим, что вы работаете над календарным приложением и вам нужно убедиться, что
    количество выходных в неделе правильно установлено.
    Исправьте следующий код так, чтобы утверждение было верно и код не выбрасывал ошибку
     */
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
