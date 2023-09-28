package classwork.task002;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task002 {
    // ��������� @Test ���������, ��� ����� testAssertions() �������� �������� �������
    @Test
    public void testAssertions() {
// ������� ������������� AssertJ ��� �������� �����������

// ������� ������ ��� ������������
        String text = "Hello, World";

// ���������, ��� ������ �� ����� null
        Assertions.assertThat(text).isNotNull();

// ���������, ��� ������ ���������� � "Hello"
        Assertions.assertThat(text).startsWith("Hello");

// ���������, ��� ������ ������������� �� "World"
        Assertions.assertThat(text).endsWith("World");

// ���������, ��� ������ �������� ��������� "lo, W"
        Assertions.assertThat(text).contains("lo, W");
    }
}
