package piggyBank;

public abstract class Money {
    protected double amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
        amount = 1;
    }

    public abstract String getName();

    public abstract double getValue();

    public abstract double getAmount();

}