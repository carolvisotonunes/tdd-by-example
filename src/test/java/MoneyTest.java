import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
