package piggyBank;

public class Nickel extends Money {
    private String name;
    private double value;

    public Nickel(int amount) {
        super(amount);
        this.value = 0.05;
        this.name = "Nickel";
    }

    public Nickel() {
        this.value = 0.05;
        this.name = "Nickel";
    }

    @Override
    public double getValue() {
        return amount * value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money {" + "name= " + name + "\'" + ", value= " + value + "\'" + ", Amount added= " + getAmount() + "\'"
                + "Total value= " + getValue() + "}";
    }
}