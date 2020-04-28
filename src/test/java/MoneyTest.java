import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void shouldReturnTenGivenFiveDollar(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
    }

    @Test
    public void shouldReturnFifteenGivenFiveDollar(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void shouldReturnTrueGivenEqualObjectsDollar(){
        assertEquals(Money.dollar(5), Money.dollar(5));
    }

    @Test
    public void shouldReturnFalseGivenDifferentObjectsDollar(){
        assertNotEquals(Money.dollar(5), Money.dollar(3));
    }

    @Test
    public void shouldReturnTrueWhenTwoDifferentObjectsAreNotEqual(){
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    public void shouldReturnTenGivenFiveFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
    }

    @Test
    public void shouldReturnFifteenGivenFiveFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void shouldReturnTrueGivenEqualObjectsFranc(){
        assertEquals(Money.franc(5), Money.franc(5));
    }

    @Test
    public void shouldReturnFalseGivenDifferentObjectsFranc(){
        assertNotEquals(Money.franc(5), Money.franc(3));
    }

    @Test
     public void shouldReturnDollar(){
        assertEquals("USD", Money.dollar(1).currency());
    }

    @Test
    public void shouldReturnFranc(){
        assertEquals("CHF", Money.franc(1).currency());
    }

}
