import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void shouldReturnTenGivenFive(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
    }

    @Test
    public void shouldReturnFifteenGivenFive(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void shouldReturnTrueGivenEqualObjects(){
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    public void shouldReturnFalseGivenDifferentObjects(){
        assertNotEquals(new Dollar(5), new Dollar(3));
    }
}
