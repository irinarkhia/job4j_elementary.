package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String NAMEWITHCHEESE = " + Extra Cheese";

    @Override
    public String name() {
        return  super.name() + NAMEWITHCHEESE;
    }
}
