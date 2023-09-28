package classwork.task002;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task002 {
    // јннотаци€ @Test указывает, что метод testAssertions() €вл€етс€ тестовым методом
    @Test
    public void testAssertions() {
// ѕримеры использовани€ AssertJ дл€ проверки утверждений

// —оздаем строку дл€ тестировани€
        String text = "Hello, World";

// ѕровер€ем, что строка не равна null
        Assertions.assertThat(text).isNotNull();

// ѕровер€ем, что строка начинаетс€ с "Hello"
        Assertions.assertThat(text).startsWith("Hello");

// ѕровер€ем, что строка заканчиваетс€ на "World"
        Assertions.assertThat(text).endsWith("World");

// ѕровер€ем, что строка содержит подстроку "lo, W"
        Assertions.assertThat(text).contains("lo, W");
    }
}
