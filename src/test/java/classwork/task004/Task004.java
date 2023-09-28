package classwork.task004;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task004 {
    @Test
    void testAssertEquals() {
        assertEquals(5, 2 + 3, "Сложение неправильно");
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(10, 2 * 3, "Умножение неправильно");
    }

    @Test
    void testAssertTrue() {
        assertTrue(5 > 3, "Утверждение должно быть true");
    }

    @Test
    void testAssertFalse() {
        assertFalse(2 > 5, "Утверждение должно быть false");
    }

    @Test
    void testAssertNull() {
        String text = null;
        assertNull(text, "Строка должна быть null");
    }

    @Test
    void testAssertNotNull() {
        String text = "Hello";
        assertNotNull(text, "Строка не должна быть null");
    }

    @Test
    void testAssertSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2, "Объекты должны быть одинаковыми");
    }

    @Test
    void testAssertNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2, "Объекты не должны быть одинаковыми");
    }
}
