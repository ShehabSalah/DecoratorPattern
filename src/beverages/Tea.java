package beverages;

import superclasses.Beverage;

public class Tea extends Beverage {
    public Tea() {
        setDescription("Tea");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
