package beverages;

import superclasses.Beverage;

public class TurkishCoffee extends Beverage {

    public TurkishCoffee() {
        setDescription("Turkish Coffee");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
