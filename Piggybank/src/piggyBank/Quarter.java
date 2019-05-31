package piggyBank;

public class Quarter extends Money {
    private String name;
    private double value;

    public Quarter(int amount) {
        super(amount);
        this.value = 0.25;
        this.name = "Quarter";
    }

    public Quarter() {
        this.value = 0.25;
        this.name = "Quarter";
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