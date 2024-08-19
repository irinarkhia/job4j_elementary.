package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String NAME_WITH_CHEESE = " + Extra Cheese";

    @Override
    public String name() {
        return  super.name() + NAME_WITH_CHEESE;
    }
}
