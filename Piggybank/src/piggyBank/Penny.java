package piggyBank;

public class Penny extends Money {
    private String name;
    private double value;

    public Penny(int amount) {
        super(amount);
        this.value = 0.01;
        this.name = "Penny";
    }

    public Penny() {
        this.value = 0.01;
        this.name = "Penny";
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