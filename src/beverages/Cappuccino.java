package beverages;
import superclasses.Beverage;

public class Cappuccino extends Beverage {
    public Cappuccino() {
        setDescription("Cappuccino");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
