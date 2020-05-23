import java.util.HashMap;

public class Bank {
    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public Integer rate(String from, String to) {
        return from.equals(to) ? 1 : rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
