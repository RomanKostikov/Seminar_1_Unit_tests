package classwork.task003;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task003 {
    @Test
    public void testAddition() {
        int result = add(3, 5);
// ���������, ��� ��������� �������� ����� ���������� �������� (8)
        assertEquals(8, result, "����� �������");
    }

    @Test
    public void testDivision() {
        int dividend = 10;
        int divisor = 2;
// ���������, ��� ������� ����������� ��� �������
        assertTrue(dividend % divisor == 0, "������� � ��������");
    }

    private int add(int a, int b) {
        return a + b;
    }
}
