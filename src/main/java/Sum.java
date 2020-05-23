public class Sum implements Expression {
    public Money augmend;
    public Money addmend;

    public Sum(Money augend, Money addend) {
        this.augmend = augend;
        this.addmend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);

    }
}
