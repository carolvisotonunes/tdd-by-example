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

    @Test
    public void simpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10), reduced);

    }

    @Test
    public void plusReturnsSum(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five,sum.augmend);
        assertEquals(five,sum.addmend);
    }

    @Test
    public void reduceSum(){
        Expression sum = new Sum(Money.dollar(3),Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(7),result);
    }

    @Test
    public void reduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1),"USD");
        assertEquals(Money.dollar(1),result);
    }

    @Test
    public void reduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2),"USD");
        assertEquals(Money.dollar(1),result);
    }

    @Test
    public void identityRate(){
        assertEquals(1,new Bank().rate("USD","USD"));
        assertEquals(1,new Bank().rate("CHF","CHF"));
    }

}
