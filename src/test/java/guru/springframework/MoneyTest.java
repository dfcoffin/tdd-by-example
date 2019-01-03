package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Donald F. Coffin 2019/01/03 at 01:07
 */
public class MoneyTest {

    @Test
    void testMultiplication() {

        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
