import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void shouldReturnTenGivenFiveDollar(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
    }

    @Test
    public void shouldReturnFifteenGivenFiveDollar(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    public void shouldReturnTrueGivenEqualObjectsDollar(){
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    public void shouldReturnFalseGivenDifferentObjectsDollar(){
        assertNotEquals(new Dollar(5), new Dollar(3));
    }



    @Test
    public void shouldReturnTenGivenFiveFranc(){
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
    }

    @Test
    public void shouldReturnFifteenGivenFiveFranc(){
        Franc five = new Franc(5);
        Franc product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    public void shouldReturnTrueGivenEqualObjectsFranc(){
        assertEquals(new Franc(5), new Franc(5));
    }

    @Test
    public void shouldReturnFalseGivenDifferentObjectsFranc(){
        assertNotEquals(new Franc(5), new Franc(3));
    }
}
