package classwork.task004;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task004 {
    @Test
    void testAssertEquals() {
        assertEquals(5, 2 + 3, "�������� �����������");
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(10, 2 * 3, "��������� �����������");
    }

    @Test
    void testAssertTrue() {
        assertTrue(5 > 3, "����������� ������ ���� true");
    }

    @Test
    void testAssertFalse() {
        assertFalse(2 > 5, "����������� ������ ���� false");
    }

    @Test
    void testAssertNull() {
        String text = null;
        assertNull(text, "������ ������ ���� null");
    }

    @Test
    void testAssertNotNull() {
        String text = "Hello";
        assertNotNull(text, "������ �� ������ ���� null");
    }

    @Test
    void testAssertSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2, "������� ������ ���� �����������");
    }

    @Test
    void testAssertNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2, "������� �� ������ ���� �����������");
    }
}
