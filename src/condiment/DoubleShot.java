package condiment;

import superclasses.Beverage;
import superclasses.ExtrasDecorator;

public class DoubleShot extends ExtrasDecorator {
    Beverage beverage;

    public DoubleShot(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Double Shot";
    }

    @Override
    public double cost() {
        return beverage.cost() * 2 - 0.10;
    }

}
