public class Sum implements Expression {
    public Expression augmend;
    public Expression addmend;

    public Sum(Expression augend, Expression addend) {
        this.augmend = augend;
        this.addmend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augmend.reduce(bank, to).amount + addmend.reduce(bank,to).amount;
        return new Money(amount, to);

    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
