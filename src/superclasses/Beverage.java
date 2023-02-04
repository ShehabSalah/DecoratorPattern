package superclasses;

public abstract class Beverage {
    String description = "Unknown superclasses.Beverage";
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
