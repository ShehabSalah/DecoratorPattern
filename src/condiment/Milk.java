package condiment;

import superclasses.Beverage;
import superclasses.ExtrasDecorator;

public class Milk extends ExtrasDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
