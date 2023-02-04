import beverages.Espresso;
import beverages.TurkishCoffee;
import condiment.DoubleShot;
import condiment.Milk;
import condiment.Whip;
import superclasses.Beverage;

public class Main {
    public static void main(String[] args) {

        Beverage turkishCoffee = new TurkishCoffee();
        Beverage doubleShot = new DoubleShot(turkishCoffee);

        System.out.println(doubleShot.getDescription());
        System.out.printf("Cost: $%.2f\n", doubleShot.cost());

        System.out.println("--------------------");

        // double espresso with double milk and whipped cream
        Beverage espresso = new Espresso();
        Beverage doubleShotEspresso = new DoubleShot(espresso);
        Beverage milk = new Milk(doubleShotEspresso);
        Beverage doubleMilk = new Milk(milk);
        Beverage whip = new Whip(doubleMilk);

        System.out.println(whip.getDescription());
        System.out.printf("Cost: $%.2f\n", whip.cost());

    }
}