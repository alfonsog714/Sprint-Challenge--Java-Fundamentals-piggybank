package piggyBank;

public class Dime extends Money {
    private String name;
    private double value;

    public Dime(int amount) {
        super(amount);
        this.value = 0.10;
        this.name = "Dime";
    }

    public Dime() {
        this.value = 0.10;
        this.name = "Dime";
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